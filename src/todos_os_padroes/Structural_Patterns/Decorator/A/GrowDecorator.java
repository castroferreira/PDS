package todos_os_padroes.Structural_Patterns.Decorator.A;

/**
 *
 * Esta classe vai ser um decorator concreto que extend da classe abstrata
 * AnimalDecorator. Implementa o método describe() para a descrição do animal e
 * adiciona mais uma funcionalidade através do método growl()
 *
 */
public class GrowDecorator extends AnimalDecorator {

    public GrowDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("Tenho asas");
        growl();
    }

    public void growl() {
        System.out.println("Grrr");
    }
}
