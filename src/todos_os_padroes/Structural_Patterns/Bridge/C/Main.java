package todos_os_padroes.Structural_Patterns.Bridge.C;

public class Main {

    public static void main(String[] args) {
        Veiculo veiculo = new OpelAstra(1200);
        veiculo.setPrintCondutor("Sergio");
        veiculo.setMotor(new MotorOpel(120));
        System.out.println(veiculo);
    }
}
