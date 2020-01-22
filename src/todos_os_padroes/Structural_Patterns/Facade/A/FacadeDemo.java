package todos_os_padroes.Structural_Patterns.Facade.A;

public class FacadeDemo {

    private final static int x = 4;

    public static void main(String[] args) {
        Facade facade = new Facade();
        System.out.println("O cubo de " + x + ":" + facade.cubeX(x));
        System.out.println("O cubo de " + x + "*2:" + facade.cubeXTime(x));
        System.out.println(x + "ao sextuplo*2:" + facade.XToSixthPowerTimes2(x));
    }
}
