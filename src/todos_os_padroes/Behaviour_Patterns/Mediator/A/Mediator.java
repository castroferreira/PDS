package todos_os_padroes.Behaviour_Patterns.Mediator.A;

/*
*Este medidor vai intermediar a comunicação entre dois compradores(um francês e um sueco), 
*um vendedor inglês e um conversor de moedas.
*O mediator tem como referência os dois compradores, o vendedor e o conversor. 
*Tem metodos para que estes tipos de objetos possam ser registados. 
*Tem tambem um método placeBid() que leva como parâmetros uma licitação e uma unidade de moeda.
*Converte este montante para oara um montante dolar através de dollarConverter().
*Por fim, pergunta ao vendedor que se oferta foi aceite e retorna a resposta.
 */
public class Mediator {

    Buyer frenchBuyer;
    Buyer swedishBuyer;
    AmericanSeller americanSeller;
    DollarConverter dollarConverter;

    public Mediator() {
    }

    public void registerFrenchBuyer(FrenchBuyer frenchBuyer) {
        this.frenchBuyer = frenchBuyer;
    }

    public void registerSwedishBuyer(SwedishBuyer swedishBuyer) {
        this.swedishBuyer = swedishBuyer;
    }

    public void registerAmericanSeller(AmericanSeller americanSeller) {
        this.americanSeller = americanSeller;
    }

    public void registerDollarConverter(DollarConverter dollarConverter) {
        this.dollarConverter = dollarConverter;
    }

    public boolean placeBid(float bid, String typeMoney) {
        float dollarAmount = dollarConverter.convertToDolares(bid, typeMoney);
        return americanSeller.isBidAccepted(dollarAmount);
    }
}
