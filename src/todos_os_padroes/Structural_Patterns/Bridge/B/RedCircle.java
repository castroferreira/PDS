package todos_os_padroes.Structural_Patterns.Bridge.B;

/**
 *
 *
 * classe concreta que implementa a interface DrawApi e desenha o circulo com as
 * dimensoes enviadas e de cor vermelha
 *
 */
public class RedCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Cirlce[ color: red, radius: " + radius + ", x: " + x + ", y : " + y + "]");
    }
}
