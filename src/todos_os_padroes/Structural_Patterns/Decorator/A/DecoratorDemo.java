package todos_os_padroes.Structural_Patterns.Decorator.A;

public class DecoratorDemo {

    public static void main(String[] args) {
        Animal animal = new LivingAnimal();
        animal.describe();

        animal = new LegDecorator(animal);
        animal.describe();

        animal = new WingDecorator(animal);
        animal.describe();

        animal = new GrowDecorator(animal);
        animal = new GrowDecorator(animal);
        animal.describe();
    }
}
