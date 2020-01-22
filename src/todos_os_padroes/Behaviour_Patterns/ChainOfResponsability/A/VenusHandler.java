package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.A;

/**
 * Subclasse de PlanetHandler e implementa o método handlePedido(). Se o pedido
 * for um Planet.Venus, vai processar o pedido. Caso contario, o pedido é
 * passado ao sucessor, caso exista.
 */
public class VenusHandler extends PlanetHandler {

    @Override
    public void handlerPedido(PlanetEnum pedido) {
        if (PlanetEnum.Venus == pedido) {
            System.out.println("VenusHandler suporta " + pedido);
            System.out.println("Venus é venoso");
        } else {
            System.out.println("VenusHandler não suporta " + pedido);
            if (sucessor != null) {
                sucessor.handlerPedido(pedido);
            }
        }
    }
}