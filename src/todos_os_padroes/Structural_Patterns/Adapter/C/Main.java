package todos_os_padroes.Structural_Patterns.Adapter.C;

public class Main {

    private final static TomadaAdaptee tomadaAdaptee = new TomadaClassAdapter();

    public static void main(String[] args) {
        testingObjectAdapter();
        System.out.println();
        testingClassAdapter();
    }

    private static void testingObjectAdapter() {
        Watt w3 = tomadaAdaptee.get3Watts();
        Watt w12 = tomadaAdaptee.get12Watts();
        Watt w120 = tomadaAdaptee.get120Watts();

        System.out.println("v3 watts using Object Adapter = " + w3.getWatts());
        System.out.println("v12 watts using Object Adapter = " + w12.getWatts());
        System.out.println("v120 watts using Object Adapter = " + w120.getWatts());
    }

    private static void testingClassAdapter() {
        Watt w3 = tomadaAdaptee.get3Watts();
        Watt w12 = tomadaAdaptee.get12Watts();
        Watt w120 = tomadaAdaptee.get120Watts();

        System.out.println("v3 watts using Class Adapter = " + w3.getWatts());
        System.out.println("v12 watts using Class Adapter = " + w12.getWatts());
        System.out.println("v120 watts using Class Adapter = " + w120.getWatts());
    }
}
