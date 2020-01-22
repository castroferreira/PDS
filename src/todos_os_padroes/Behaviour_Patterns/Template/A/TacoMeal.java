package todos_os_padroes.Behaviour_Patterns.Template.A;

/**
 *
 * Classe concreta que extende da classe Meal e implementa os 3 metodos
 * abstratos e substitui o método eat()
 *
 */
public class TacoMeal extends Meal {

    @Override
    void prepararIngredientes() {
        System.out.println("Preparar carne moída!");
    }

    @Override
    void cook() {
        System.out.println("Cozinhando carne moída!!");
    }

    @Override
    void eat() {
        System.out.println("Que taco delicioso!!");
    }

    @Override
    void cleanUp() {
        System.out.println("Limpando...");
    }
}
