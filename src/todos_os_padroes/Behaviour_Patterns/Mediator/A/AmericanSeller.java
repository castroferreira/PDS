package todos_os_padroes.Behaviour_Patterns.Mediator.A;

/*
 * Esta classe recebe a referÊncia para o mediator e o preço em dolares.
este é o preço no final de um produto a ser vendido. 
O vendedor regista o mediador como AmericanSeller.
O método isBidAccepted() do vendedor leva uma bid(em dolares). 
Caso a bid supere o preço, a oferta é considerada valida e é retornado true.
Caso contrario, é retornado false.
 */
public class AmericanSeller {

    Mediator mediator;
    float priceDollar;

    public AmericanSeller(Mediator mediator, float priceDollar) {
        this.mediator = mediator;
        this.priceDollar = priceDollar;
        this.mediator.registerAmericanSeller(this);
    }

    public boolean isBidAccepted(float bidDollares) {
        if (bidDollares > priceDollar) {
            System.out.println("Vendedor aceita a licitação de: " + bidDollares + " dolares");
            return true;
        } else {
            System.out.println("Vendedor rejeita a licitação de: " + bidDollares + " dolares");
            return false;
        }
    }
}
