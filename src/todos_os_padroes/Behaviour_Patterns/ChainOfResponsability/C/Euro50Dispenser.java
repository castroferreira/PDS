package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.C;

public class Euro50Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    public Euro50Dispenser(DispenseChain nextChain) {
        setNextChain(nextChain);
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(int ammount) {
        if (ammount >= 50) {
            int num = ammount / 50;
            int remainder = ammount % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0) {
                this.nextChain.dispense(remainder);
            }
        } else {
            this.nextChain.dispense(ammount);
        }
    }
}
