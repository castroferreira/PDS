package todos_os_padroes.Creational_Patterns.FactoryMethod.A;

public class main {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal a1 = animalFactory.getAnimal("dog");
        System.out.println("Dog: " + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("Cat");
        System.out.println("Cat: " + a2.makeSound());
    }
}
