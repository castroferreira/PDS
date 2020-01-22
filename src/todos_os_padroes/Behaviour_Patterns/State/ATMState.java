package todos_os_padroes.Behaviour_Patterns.State;

public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);
}
