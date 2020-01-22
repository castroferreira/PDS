package todos_os_padroes.Structural_Patterns.Decorator.C;

public class TeamManager extends DecoratorEmployee {

    public TeamManager(EmployeeInterface e) {
        super(e);
    }

    @Override
    public void work() {
        e.work();
        manage();
    }

    public void manage() {
        System.out.printf("\t%-15s Manage\n", "Team Manager");
    }
}
