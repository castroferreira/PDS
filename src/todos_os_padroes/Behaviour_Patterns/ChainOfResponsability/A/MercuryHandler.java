package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.A;

/**
 * Subclasse de PlanetHandler e implementa o método handlePedido(). Se o pedido
 * for um Planet.Mercury, vai processar o pedido. Caso contario, o pedido é
 * passado ao sucessor, caso exista.
 */
public class MercuryHandler extends PlanetHandler {

    @Override
    public void handlerPedido(PlanetEnum pedido) {
        if (PlanetEnum.Mercury == pedido) {
            System.out.println("MercuryHandler suporta " + pedido);
            System.out.println("Mercurio é quente!!");
        } else {
            System.out.println("MercuryHandler não suporta " + pedido);
            if (sucessor != null) {
                sucessor.handlerPedido(pedido); // vai definir o proximo sucessor
            }
        }
    }
}
