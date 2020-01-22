package todos_os_padroes.Structural_Patterns.Bridge.A;

/**
 *
 * Classe concreta que extende da classe Veiculo e informa que é o SmallCar que
 * está a andar
 *
 */
public class SmallCar extends Veiculo {

    public SmallCar(Motor motor) {
        this.pesoKilos = 1000;
        this.motor = motor;
    }

    @Override
    void drive() {
        System.out.println("SmallCar está andar");
        int ncavalos = motor.go();
        relatarVelocidade(ncavalos);
    }
}
