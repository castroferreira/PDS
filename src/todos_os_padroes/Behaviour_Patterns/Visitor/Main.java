package todos_os_padroes.Behaviour_Patterns.Visitor;

public class Main {

    public static void main(String[] args) {
        VisitorConcrete visitorConcrete = new VisitorConcrete();
        visitorConcrete.visit(new Keyboard());
        visitorConcrete.visit(new Mouse());
        visitorConcrete.visit(new Monitor());
    }
}
