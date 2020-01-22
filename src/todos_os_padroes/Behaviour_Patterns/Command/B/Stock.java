package todos_os_padroes.Behaviour_Patterns.Command.B;

/**
 *
 * Classe Receiver
 *
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 5;

    public void buy() {
        System.out.println("Stock : Name: " + name + ", Quantity: " + quantity + " ---> bought");
    }

    public void sell() {
        System.out.println("Stock : Name: " + name + ", Quantity: " + quantity + " ---> sold");
    }
}
