package todos_os_padroes.Creational_Patterns.AbstractFactory.A;

/**
 *
 * Criação da fábrica concreta Mamifero que vai retornar um animal (cão ou gato)
 *
 */
public class MamiFactory extends SpeciesFactories {

    @Override
    Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        return null;
    }
}
