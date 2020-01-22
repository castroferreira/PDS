package todos_os_padroes.Behaviour_Patterns.Strategy.A;

/**
 *
 * Classe concreta de strategy que implementa a interface Strategy. Caso a
 * temperatura seja 32 ou menos, o metodo retorna true.
 *
 */
public class SkiStrategy implements Strategy {

    @Override
    public boolean checkTemperatura(int temperaturaF) {
        if (temperaturaF <= 32) {
            return true;
        }
        return false;
    }
}
