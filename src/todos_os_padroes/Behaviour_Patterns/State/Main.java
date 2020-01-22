package todos_os_padroes.Behaviour_Patterns.State;

public class Main {

    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine(2000);

        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
    }
}
