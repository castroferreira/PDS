package todos_os_padroes.Creational_Patterns.Builder.A;

/**
 * esta classe é um builder concreto que implementa a interface MealBuilder.
 * Esta classe cria a refeição e os seus métodos são implementados para
 * construir várias partes da refeição. No final, a refeição é retornada através
 * do método getMeal()
 *
 */
public class ItalianMealBuilder implements MealBuilder {

    private Meal meal;

    public ItalianMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void buildBebida() {
        meal.setBebida("Vinho tinto");
    }

    @Override
    public void buildPrato() {
        meal.setPrato("lasanha");
    }

    @Override
    public void buildEntrada() {
        meal.setEntrada("stiks de mozzarella");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
