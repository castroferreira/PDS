package todos_os_padroes.Behaviour_Patterns.Strategy.B;

public class Main {

    public static void main(String[] args) {
        Context c = new Context(2, 3);
        c.setStrategy(new MinusOperation());
        c.executeStrategy();
        c.setStrategy(new MultiplyOperation());
        c.executeStrategy();
        c.setStrategy(new SumOperations());
        c.executeStrategy();
    }
}
