package todos_os_padroes.Structural_Patterns.Decorator.C;

public class Main {

    public static void main(String[] args) {

        EmployeeInterface emp = new Employee("Sergio");
        emp.work();

        DecoratorEmployee decor = new TeamManager(emp);
        decor.work();

        DecoratorEmployee decor2 = new TeamLeader(decor);
        decor2.work();

        DecoratorEmployee decor3 = new TeamMember(decor2);
        decor3.work();
    }
}