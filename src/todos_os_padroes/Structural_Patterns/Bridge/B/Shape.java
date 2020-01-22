package todos_os_padroes.Structural_Patterns.Bridge.B;

/**
 *
 * Classe bridge abstrata referencia a interface DrawApi e criação do metodo
 * draw para desenhar a forma
 *
 */
public abstract class Shape {

    DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
