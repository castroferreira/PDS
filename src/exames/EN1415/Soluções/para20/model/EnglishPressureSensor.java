package exames.EN1415.Soluções.para20.model;

public class EnglishPressureSensor {

    /**
     * @return PSI pressure
     */
    public double measure() {
        // a ligação ao dispositivo é feita aqui. 
        // para simplificar e testar a aplicação devolve-se um valor constante
        return 20.5;
    }

    @Override
    public String toString() {
        return "EnglishPressure";
    }

}
