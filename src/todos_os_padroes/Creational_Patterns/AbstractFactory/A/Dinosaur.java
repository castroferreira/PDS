package todos_os_padroes.Creational_Patterns.AbstractFactory.A;

/**
 *
 * Criação das classe concreta Dinosaur que implementa a interface Animal
 *
 */
public class Dinosaur implements Animal {

    @Override
    public String makeSound() {
        return "Roar";
    }
}
