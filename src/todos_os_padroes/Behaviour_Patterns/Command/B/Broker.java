package todos_os_padroes.Behaviour_Patterns.Command.B;

import java.util.ArrayList;

public class Broker {

    ArrayList<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrder() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
