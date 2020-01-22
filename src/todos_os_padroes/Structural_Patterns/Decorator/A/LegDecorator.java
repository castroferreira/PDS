package todos_os_padroes.Structural_Patterns.Decorator.A;

/**
 *
 * Esta classe vai ser um decorator concreto que extend da classe abstrata
 * AnimalDecorator. Implementa o método describe() para a descrição do animal e
 * adiciona mais uma funcionalidade através do método dance()
 *
 */
public class LegDecorator extends AnimalDecorator {

    public LegDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("Tenho pernas");
        dance();
    }

    public void dance() {
        System.out.println("Eu danço");
    }
}
