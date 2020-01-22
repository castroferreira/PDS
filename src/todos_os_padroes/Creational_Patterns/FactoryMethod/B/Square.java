package todos_os_padroes.Creational_Patterns.FactoryMethod.B;

/**
 *
 * criação da classe concreta Square que implementa a interface Shape
 *
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Desenhar Quadrado");
    }
}
