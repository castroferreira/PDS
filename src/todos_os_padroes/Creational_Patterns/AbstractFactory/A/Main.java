package todos_os_padroes.Creational_Patterns.AbstractFactory.A;

public class Main {

    public static void main(String[] args) {

        AbstractFactory speciesFactory = new AbstractFactory();

        SpeciesFactories type = speciesFactory.getSpeciesFactories("mammal");

        Animal animal = type.getAnimal("Dog");
        System.out.println(animal.makeSound());

        Animal animal2 = type.getAnimal("Cat");
        System.out.println(animal2.makeSound());

        SpeciesFactories type1 = speciesFactory.getSpeciesFactories("reptile");
        Animal animal3 = type1.getAnimal("Snake");
        System.out.println(animal3.makeSound());

        Animal animal4 = type1.getAnimal("Dinosaur");
        System.out.println(animal4.makeSound());

    }
}
