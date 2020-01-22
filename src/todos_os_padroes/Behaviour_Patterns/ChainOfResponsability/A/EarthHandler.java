package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.A;

/**
 * Subclasse de PlanetHandler e implementa o método handlePedido(). Se o pedido
 * for um Planet.Earth, vai processar o pedido. Caso contario, o pedido é
 * passado ao sucessor, caso exista.
 */
public class EarthHandler extends PlanetHandler {

    @Override
    public void handlerPedido(PlanetEnum pedido) {
        if (PlanetEnum.Earth == pedido) {
            System.out.println("EarthHandler suporta " + pedido);
            System.out.println("A Terra tem vida!!");
        } else {
            System.out.println("EarthHandler não suporta " + pedido);
            if (sucessor != null) {
                sucessor.handlerPedido(pedido);
            }
        }
    }

}
