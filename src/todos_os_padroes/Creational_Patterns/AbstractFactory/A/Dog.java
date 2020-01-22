package todos_os_padroes.Creational_Patterns.AbstractFactory.A;

/**
 *
 * Criação das classe concreta Dog que implementa a interface Animal
 *
 */
public class Dog implements Animal {

    @Override
    public String makeSound() {
        return "Woof";
    }
}
