package todos_os_padroes.Structural_Patterns.Bridge.C;

public class MotorOpel implements Motor {

    private int nCavalos;

    public MotorOpel(int nCavalos) {
        this.nCavalos = nCavalos;
    }

    @Override
    public int nCavalos() {
        return nCavalos;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Este motor tem: " + nCavalos + " cavalos");
        return str.toString();
    }
}
