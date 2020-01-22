package todos_os_padroes.Structural_Patterns.Composite.A;

public class CompositeDemo {

    public static void main(String[] args) {

        Leaf f1 = new Leaf("João");
        Leaf f2 = new Leaf("Beatriz");
        Leaf f3 = new Leaf("Pedro");
        Leaf f4 = new Leaf("Ana");
        Leaf f5 = new Leaf("Tiago");

        composite composite1 = new composite();
        composite1.add(f1);
        composite1.add(f2);

        composite composite2 = new composite();
        composite2.add(f3);
        composite2.add(f4);

        composite composite3 = new composite();
        composite3.add(composite1);
        composite3.add(composite2);
        composite3.add(f5);

        System.out.println("- Calling 'say Hello' na folha1");
        f1.sayHello();

        System.out.println("- Calling 'say Hello' na composite1");
        composite1.sayHello();

        System.out.println("- Calling 'say Hello' no composite2");
        composite2.sayHello();

        System.out.println("- Calling 'say Goodbye' na composite3");
        composite3.sayGoodbye();
    }
}
