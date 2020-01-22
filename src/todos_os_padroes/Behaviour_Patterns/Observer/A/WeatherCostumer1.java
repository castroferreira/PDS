package todos_os_padroes.Behaviour_Patterns.Observer.A;

/*
É um observer que implementa WeatherObserver. o metodo doUpdate() retorna a temperatura atual 
 */
public class WeatherCostumer1 implements WeatherObserver {

    @Override
    public void doUpdate(int temperatura) {
        System.out.println("Temperatura no Weather1: " + temperatura);
    }
}
