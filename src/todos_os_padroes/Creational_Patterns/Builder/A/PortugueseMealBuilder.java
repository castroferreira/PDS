package todos_os_padroes.Creational_Patterns.Builder.A;

/**
 *
 * esta classe é um builder concreto que implementa a interface MealBuilder.
 * Esta classe cria a refeição e os seus métodos são implementados para
 * construir várias partes da refeição. No final, a refeição é retornada através
 * do método getMeal()
 *
 */
public class PortugueseMealBuilder implements MealBuilder {

    private Meal meal;

    public PortugueseMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void buildBebida() {
        meal.setBebida("Super Bock");
    }

    @Override
    public void buildPrato() {
        meal.setPrato("Feijoada");
    }

    @Override
    public void buildEntrada() {
        meal.setEntrada("Pão com Manteiga");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
