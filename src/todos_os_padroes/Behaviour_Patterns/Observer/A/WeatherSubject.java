package todos_os_padroes.Behaviour_Patterns.Observer.A;

/*
vai ser a classe subject que declara três métodos: addObersever(), removeObserver(), doNotify() 
 */
public interface WeatherSubject {

    public void addObserver(WeatherObserver weatherObserver);

    public void removeObserver(WeatherObserver weatherObserver);

    public void doNotify();
}
