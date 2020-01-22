package todos_os_padroes.Creational_Patterns.AbstractFactory.A;

/**
 *
 * Criação da fábrica concreta Reptil que vai retornar um animal (cobra ou
 * dinossauro)
 *
 */
public class ReptileFactory extends SpeciesFactories {

    @Override
    Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("snake")) {
            return new Snake();
        } else if (type.equalsIgnoreCase("Dinosaur")) {
            return new Dinosaur();
        }
        return null;
    }
}
