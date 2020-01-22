package aulas_praticas.aula07_03;

import java.util.ArrayList;
import java.util.List;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Bloco extends Figura {

    private List<Figura> figuras = new ArrayList<>();
    static String tabs = "";

    public Bloco(String name) {
        super.name = name;
    }

    public void add(Figura f) {
        figuras.add(f);
    }

    @Override
    public void draw() {
        System.out.println("Window " + super.name);

        tabs += "\t";

        for (Figura f : figuras) {
            System.out.print(tabs);
            f.draw();
        }

        tabs = tabs.substring(0, tabs.length() - 1);
    }
}
