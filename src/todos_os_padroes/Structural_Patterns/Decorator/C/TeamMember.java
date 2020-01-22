package todos_os_padroes.Structural_Patterns.Decorator.C;

public class TeamMember extends DecoratorEmployee {

    public TeamMember(EmployeeInterface e) {
        super(e);
    }

    @Override
    public void work() {
        e.work();
        colaborate();
    }

    public void colaborate() {
        System.out.printf("\t%-15s Colaborate\n", "Team Member");
    }
}
