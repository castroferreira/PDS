package todos_os_padroes.Behaviour_Patterns.Strategy.B;

public class SumOperations implements Strategy {

    @Override
    public void algorithm(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
