package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.C;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(int ammount);
}
