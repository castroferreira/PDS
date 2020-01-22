package todos_os_padroes.Structural_Patterns.Bridge.A;

/**
 *
 * Classe concreta que extende da classe Veiculo e informa que é o BigBus que
 * está a andar
 *
 */
public class BigBus extends Veiculo {

    public BigBus(Motor motor) {
        this.pesoKilos = 3000;
        this.motor = motor;
    }

    @Override
    void drive() {
        System.out.println("BigBus está andar");
        int ncavalos = motor.go();
        relatarVelocidade(ncavalos);
    }
}
