package todos_os_padroes.Behaviour_Patterns.Command.B;

/**
 *
 * Implementa a interface Order(Command) e faz referencia ao Stock(receiver). O
 * método execute vai evocar a ação deste command.
 *
 */
public class BuyStock implements Order {

    Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
