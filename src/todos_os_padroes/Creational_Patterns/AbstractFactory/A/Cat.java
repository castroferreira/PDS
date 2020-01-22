package todos_os_padroes.Creational_Patterns.AbstractFactory.A;

/**
 *
 * Criação das classe concreta Cat que implementa a interface Animal
 *
 */
public class Cat implements Animal {

    @Override
    public String makeSound() {
        return "Miau";
    }
}
