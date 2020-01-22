package aulas_praticas.aula05_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {
        Commodity[] menu = new Commodity[2];

        menu[0] = BeverageFactory.createBeverage(Temperature.COLD);
        menu[1] = MeatFactory.createMeat(Temperature.WARM);

        Container[] containers = new Container[2];
        containers[0] = ContainerFactory.createContainerFor(menu[0]);
        containers[1] = ContainerFactory.createContainerFor(menu[1]);

        containers[0].placeCommodity(menu[0]);
        containers[1].placeCommodity(menu[1]);

        System.out.println("Thank you for choosing your meal!");

        for (Container c : containers) {
            System.out.println(c);
        }
    }
}
