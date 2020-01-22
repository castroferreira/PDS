package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.C;

public class Euro10Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    public Euro10Dispenser(DispenseChain nextChain) {
        setNextChain(nextChain);
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(int ammount) {
        if (ammount >= 10) {
            int num = ammount / 10;
            int remainder = ammount % 10;
            System.out.println("Dispensing " + num + " 10$ note");
            if (remainder != 0) {
                this.nextChain.dispense(remainder);
            }
        } else {
            this.nextChain.dispense(ammount);
        }
    }
}
