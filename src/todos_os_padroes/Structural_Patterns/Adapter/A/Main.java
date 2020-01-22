package todos_os_padroes.Structural_Patterns.Adapter.A;

/**
 *
 * é a classe Client. Inicialmente é criado um objeto TemperatureClassReporter e
 * faz referência a ele através de uma temperaturaInfo. Depois é criado um
 * objeto TemperatureObjetReporter e este faz referência a ele através da mesma
 * referência de TemperatureInfo.
 *
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("class adapter test");
        TemperaturaInfo tempInfo = new TemperatureClassReporter();
        testTempInfo(tempInfo);
        //Adapter Object
        System.out.println("objeto adapter test");
        tempInfo = new TemperatureClassReporter();
        testTempInfo(tempInfo);
    }

    public static void testTempInfo(TemperaturaInfo tempInfo) {
        tempInfo.setTemperaturaC(0);
        System.out.println("temp in C:" + tempInfo.getTemperaturaC());
        System.out.println("temp in F:" + tempInfo.getTemperaturaF());
        tempInfo.setTemperaturaF(85);
        System.out.println("temp in C:" + tempInfo.getTemperaturaC());
        System.out.println("temp in F:" + tempInfo.getTemperaturaF());
    }
}
