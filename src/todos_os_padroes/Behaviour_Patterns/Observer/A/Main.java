package todos_os_padroes.Behaviour_Patterns.Observer.A;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(33);
        WeatherCostumer1 customer1 = new WeatherCostumer1();
        WeatherCustomer2 customer2 = new WeatherCustomer2();
        weatherStation.addObserver(customer1);
        weatherStation.addObserver(customer2);

        weatherStation.setTemperatura(34);
        weatherStation.removeObserver(customer1);
        weatherStation.setTemperatura(35);
    }
}
