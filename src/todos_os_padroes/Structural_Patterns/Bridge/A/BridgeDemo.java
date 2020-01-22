package todos_os_padroes.Structural_Patterns.Bridge.A;

public class BridgeDemo {

    public static void main(String[] args) {
        Veiculo veiculo = new BigBus(new SmallMotor());
        veiculo.drive();
        veiculo.setMotor(new BigMotor());
        veiculo.drive();

        veiculo = new SmallCar(new SmallMotor());
        veiculo.drive();
        veiculo.setMotor(new BigMotor());
        veiculo.drive();
    }
}
