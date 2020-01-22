package todos_os_padroes.Structural_Patterns.Decorator.C;

public class Employee implements EmployeeInterface {

    private String nome;

    public Employee(String nome) {
        this.nome = nome;
    }

    @Override
    public void work() {
        System.out.println("\nEmployee " + nome + " works");
    }

    @Override
    public String toString() {
        return String.format("nome: %s", nome);
    }
}
