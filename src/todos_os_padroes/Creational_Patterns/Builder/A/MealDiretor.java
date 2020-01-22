package todos_os_padroes.Creational_Patterns.Builder.A;

/**
 *
 * Invoação de um parâmetro MealBuilder no seu construtor. Assim, uma interface
 * MealBuilder diferente será construida pelo MealDiretor dependendo do builder
 * concreto passado no construtor. A montagem da Meal ocorre no método
 * constructMeal, ou seja, o método indica os ingredientes que constituem 1
 * refeição e no final a refeição é retornada no método getMeal
 *
 */
public class MealDiretor {

    private MealBuilder mealBuilder = null;

    public MealDiretor(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void constructMeal() {
        mealBuilder.buildBebida();
        mealBuilder.buildEntrada();
        mealBuilder.buildPrato();
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }
}
