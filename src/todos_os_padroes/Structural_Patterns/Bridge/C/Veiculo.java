package todos_os_padroes.Structural_Patterns.Bridge.C;

public abstract class Veiculo {

    private Motor motor;
    private int peso;

    public abstract void setPrintCondutor(String condutor);

    public Motor getMotor() {
        return motor;
    }

    public int getPeso() {
        return peso;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void velocidadePrint(int nCavalos) {
        int racio = peso / nCavalos;

        if (racio < 3) {
            System.out.println("O veiculo vai exceder a velocidade.");
        } else if (racio >= 3 && racio < 8) {
            System.out.println("O veiculo vai a velocidade moderada.");
        } else {
            System.out.println("O veiculo vai a uma velocidade baixa");
        }
    }

    @Override
    public String toString() {
        return "Veiculo [getMotor()=" + getMotor() + ", getPeso()=" + getPeso() + "]";
    }
}