package todos_os_padroes.Structural_Patterns.Decorator.A;

/**
 *
 * A classe abstrata Animal decorator implementa a interface Animal mas como é
 * abstrata não necessita de implementar o metodo da interface.
 *
 */
public abstract class AnimalDecorator implements Animal {

    Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }
}
