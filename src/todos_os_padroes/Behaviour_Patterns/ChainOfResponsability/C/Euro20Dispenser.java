package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.C;

public class Euro20Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    public Euro20Dispenser(DispenseChain nextChain) {
        setNextChain(nextChain);
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(int ammount) {
        if (ammount >= 20) {
            int num = ammount / 20;
            int remainder = ammount % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (remainder != 0) {
                this.nextChain.dispense(remainder);
            }
        } else {
            this.nextChain.dispense(ammount);
        }
    }
}
