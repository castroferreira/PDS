package todos_os_padroes.Behaviour_Patterns.Visitor;

public class Keyboard implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Keyboard";
    }
}
