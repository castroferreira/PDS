package todos_os_padroes.Structural_Patterns.Decorator.A;

/**
 *
 * Esta classe vai ser ConcretComponent e implementa e interface Animal
 *
 */
public class LivingAnimal implements Animal {

    @Override
    public void describe() {
        System.out.println("Sou um animal");
    }
}
