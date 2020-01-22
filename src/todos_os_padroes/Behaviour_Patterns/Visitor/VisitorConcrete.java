package todos_os_padroes.Behaviour_Patterns.Visitor;

public class VisitorConcrete implements Visitor {

    @Override
    public void visit(Visitable visitable) {
        System.out.println("Visiting: " + visitable);
    }
}
