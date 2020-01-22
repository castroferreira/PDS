package todos_os_padroes.Behaviour_Patterns.Strategy.A;

/**
 *
 * Classe que contém uma temperatura e faz referência para um strategy. O
 * strategy pode ser alterado, resultando em um comportamento diferente que
 * opera sobre os mesmos dados no contexto. O resultado é obtido no metodo
 * getResult().
 *
 */
public class Context {

    Strategy strategy;
    int temperaturaF;

    public Context(Strategy strategy, int temperaturaF) {
        this.strategy = strategy;
        this.temperaturaF = temperaturaF;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getTemperaturaF() {
        return temperaturaF;
    }

    public boolean getResult() {
        return strategy.checkTemperatura(temperaturaF);
    }
}
