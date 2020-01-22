package todos_os_padroes.Behaviour_Patterns.NullObject.B;

public class Main {

    public static void main(String[] args) {
        User customer1 = UserFactory.getUser("Andreia");
        User customer2 = UserFactory.getUser("Hugo");
        User customer3 = UserFactory.getUser("Daniel");
        User customer4 = UserFactory.getUser("Andreia");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
