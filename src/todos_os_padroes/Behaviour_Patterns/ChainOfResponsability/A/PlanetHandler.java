package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.A;

/**
 * Uso de uma classe abastrata para a manipulação das subclasses e para que
 * estas possam implementar o método setSucessor(). As subclasses terão de
 * implementar o método handlerPedido()
 */
public abstract class PlanetHandler {

    PlanetHandler sucessor;

    public void setSucessor(PlanetHandler sucessor) {
        this.sucessor = sucessor;
    }

    public abstract void handlerPedido(PlanetEnum pedido);
}
