package todos_os_padroes.Behaviour_Patterns.Template.A;

/**
 *
 * Classe abstrata com um metodo template chamado doMeal(). Este define as
 * etapas envolvidas na refeição. O método é definido como final para não ser
 * substituido.
 *
 */
public abstract class Meal {

    public final void doMeal() {
        prepararIngredientes();
        cook();
        eat();
        cleanUp();
    }

    abstract void prepararIngredientes();

    abstract void cook();

    void eat() {
        System.out.println("Que Bom!");
    }

    abstract void cleanUp();
}
