package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.A;

/**
 * classe cliente. Cria uma cadeira de manipuladores começando por
 * MercuryHandler, depois VenusHandler e EarthHandler. O método setUpChain()
 * retorna a cadeia para Main() através de uma referência PlanetHandler. São
 * feitos quatro pedidos.
 */
public class Main {

    public static void main(String[] args) {

        PlanetHandler chain = setUpChain();
        chain.handlerPedido(PlanetEnum.Venus);
        chain.handlerPedido(PlanetEnum.Earth);
        chain.handlerPedido(PlanetEnum.Mercury);
        chain.handlerPedido(PlanetEnum.Jupiter);
    }

    public static PlanetHandler setUpChain() {

        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();

        mercuryHandler.setSucessor(venusHandler);
        venusHandler.setSucessor(earthHandler);

        return mercuryHandler;
    }
}
