package todos_os_padroes.Creational_Patterns.FactoryMethod.A;

/**
 *
 * Criação da fábrica AnimalFactory que vai invocar uma nova classe dependendo
 * do tipo de animal que foi escolhido
 *
 */
public class AnimalFactory {

    public Animal getAnimal(String type) {

        if (type.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("Cat")) {
            return new Cat();
        }
        return null;
    }
}
