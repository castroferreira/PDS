package todos_os_padroes.Structural_Patterns.Bridge.A;

/**
 *
 * Classe abstrata que faz referencia ao tipo de motor que um certo veiculo usa
 * e a sua velocidade
 *
 */
public abstract class Veiculo {

    Motor motor;
    int pesoKilos;

    abstract void drive();

    void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void relatarVelocidade(int ncavalos) {
        int racio = pesoKilos / ncavalos;
        if (racio < 3) {
            System.out.println("Veiculo vai a exceder a velocidade");
        } else if ((racio >= 3) && (racio < 8)) {
            System.out.println("Veiculo está numa velocidade media");
        } else {
            System.out.println("Veiculo vai a uma velocidade baixa");
        }
    }
}
