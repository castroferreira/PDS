package aulas_praticas.aula07_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class GeometricFigures {

    public static void main(String[] args) {
        Bloco principal = new Bloco("Main");
        Bloco top = new Bloco("Top");
        Bloco bot = new Bloco("Bottom");
        top.add(new Rectangulo("jogo"));
        principal.add(top);
        principal.add(bot);
        bot.add(new Circulo("rosa"));
        bot.add(new Quadrado("verde"));
        top.add(new Bloco("Outra área"));
        principal.draw();
    }
}
