package todos_os_padroes.Structural_Patterns.Bridge.B;

/**
 *
 * Classe concreta que recebe como argumentos no construtor as cordenadas, o
 * raio do circulo e a sua cor (DrawApi) e desenha o circulo no metodo draw()
 * consoante a informação que recebe
 *
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
