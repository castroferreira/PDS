package todos_os_padroes.Structural_Patterns.Decorator.C;

public class TeamLeader extends DecoratorEmployee {

    public TeamLeader(EmployeeInterface e) {
        super(e);
    }

    @Override
    public void work() {
        e.work();
        lead();
    }

    public void lead() {
        System.out.printf("\t%-15s Leads\n", "Team Leader");
    }
}
