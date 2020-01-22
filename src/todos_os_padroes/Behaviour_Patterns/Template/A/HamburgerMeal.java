package todos_os_padroes.Behaviour_Patterns.Template.A;

/**
 *
 * Classe concreta que extende da classe Meal e implementa os 3 metodos
 * abstratos
 *
 */
public class HamburgerMeal extends Meal {

    @Override
    void prepararIngredientes() {
        System.out.println("Preparar Hamburger, pão e batatas!");
    }

    @Override
    void cook() {
        System.out.println("cozinhando hamburger e batatas");
    }

    @Override
    void cleanUp() {
        System.out.println("Limpando...");
    }
}
