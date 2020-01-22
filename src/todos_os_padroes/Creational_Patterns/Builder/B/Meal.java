package todos_os_padroes.Creational_Patterns.Builder.B;

import java.util.ArrayList;

public class Meal {

    ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {

        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }

        return cost;
    }

    public void showItem() {
        for (Item item : items) {
            System.out.println("Item: " + item.name() + ", Packing: " + item.packing().pack() + ", Price: " + item.price());
        }
    }
}
