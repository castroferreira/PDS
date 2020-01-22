package todos_os_padroes.Structural_Patterns.Bridge.B;

/**
 *
 * classe concreta que implementa a interface DrawApi e desenha o circulo com as
 * dimensoes enviadas e de cor verde
 *
 */
public class GreenCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
