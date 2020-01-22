package todos_os_padroes.Behaviour_Patterns.Mediator.A;

/**
 *
 * Esta classe tem um tipo de moeda como parâmetro e também uma referência para
 * o mediator. Esta tem um método attempToPurchase() que envia uma licitação
 * para o método placeBid() do mediador e retorna a resposta do mediator.
 */
public class Buyer {

    Mediator mediator;
    String typeMoney;

    public Buyer(Mediator mediator, String typeMoney) {
        this.mediator = mediator;
        this.typeMoney = typeMoney;
    }

    public boolean attempToPurchase(float bid) {
        System.out.println("Comprador licita " + bid + " " + typeMoney);
        return mediator.placeBid(bid, typeMoney);
    }
}
