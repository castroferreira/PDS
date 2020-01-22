package todos_os_padroes.Structural_Patterns.Decorator.C;

public abstract class DecoratorEmployee implements EmployeeInterface {

    protected EmployeeInterface e;

    public DecoratorEmployee(EmployeeInterface e) {
        this.setE(e);
    }

    @Override
    public void work() {
        e.work();
    }

    public void setE(EmployeeInterface e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return e.toString();
    }
}
