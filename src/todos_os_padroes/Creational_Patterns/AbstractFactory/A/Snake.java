package todos_os_padroes.Creational_Patterns.AbstractFactory.A;

/**
 *
 * Criação das classe concreta Snake que implementa a interface Animal
 *
 */
public class Snake implements Animal {

    @Override
    public String makeSound() {
        return "Hiss";
    }
}
