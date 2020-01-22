package aulas_praticas.aula04_T1_02;

import java.util.ArrayList;
import java.util.List;

public class Rua {

    private List<Familia> familias;
    private int portaMaxima;

    public Rua() {

        this.familias = new ArrayList<>();
        this.portaMaxima = 0;

    }

    public List<Familia> getFamilias() {
        return familias;
    }

    public void addFamilia(Familia familia) {
        if (familia.getNrPortaFinal() > this.portaMaxima) {
            this.portaMaxima = familia.getNrPortaFinal();
        }
        this.familias.add(familia);
    }

    public int getPortaMaxima() {
        return portaMaxima;
    }

}
