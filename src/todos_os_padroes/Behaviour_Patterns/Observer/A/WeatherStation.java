package todos_os_padroes.Behaviour_Patterns.Observer.A;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
implementa o WeatherSubject. Mantém um conjunto de WeatherObservers que são adiconados (addObserver()) e removidos (removeObservers())
Quando o estado WeatherSubject é alterado via setTemperatura(), o método doNotify é invocado com todos os WeatherObservers com a temperatura
através dos metodos doUpdate()
 */
public class WeatherStation implements WeatherSubject {

    int temperatura;
    Set<WeatherObserver> weatherObservers;

    public WeatherStation(int temperatura) {
        this.temperatura = temperatura;
        weatherObservers = new HashSet<WeatherObserver>();
    }

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    @Override
    public void doNotify() {
        Iterator<WeatherObserver> it = weatherObservers.iterator();

        while (it.hasNext()) {
            WeatherObserver weatherObserver = it.next();
            weatherObserver.doUpdate(temperatura);
        }
    }

    public void setTemperatura(int temperatura) {
        System.out.println("Temperatura nova: " + temperatura);
        this.temperatura = temperatura;
        doNotify();
    }
}
