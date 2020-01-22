package todos_os_padroes.Creational_Patterns.AbstractFactory.A;

/**
 *
 * Classe abstrata que retorna um objeto do tipo Animal
 *
 */
public abstract class SpeciesFactories {

    abstract Animal getAnimal(String type);
}
