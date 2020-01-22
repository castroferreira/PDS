package todos_os_padroes.Behaviour_Patterns.Strategy.B;

public class Context {

    private Strategy strategy;
    private int num1;
    private int num2;

    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.algorithm(num1, num2);
    }
}
