package todos_os_padroes.Structural_Patterns.Bridge.B;

/**
 *
 * Interface implementadora com o metodo drawCircle que recebe como argumentos
 * as coordenadas e o raio do circulo
 *
 */
public interface DrawApi {

    void drawCircle(int radius, int x, int y);
}
