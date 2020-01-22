package todos_os_padroes.Behaviour_Patterns.Strategy.A;

/**
 *
 * Classe concreta de strategy que implementa a interface Strategy. Aceita
 * temperaturas de 50-90ºF
 *
 */
public class HikeStrategy implements Strategy {

    @Override
    public boolean checkTemperatura(int temperaturaF) {
        if ((temperaturaF >= 50) && (temperaturaF <= 90)) {
            return true;
        }
        return false;
    }
}
