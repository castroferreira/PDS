package todos_os_padroes.Behaviour_Patterns.Mediator.A;

/**
 *
 * Criado um objeto SwedishBuyer, um objeto FrenchBuyer e um AmericanSeller e um
 * preço da venda definida em 10 dolares. Cria-se um DollarConverter. Todos os
 * objetos registam-se com o mediator nos seus construtores. O comprador sueco
 * começa com um lance e mantém as licitações em incrementosde x coroas atéque
 * seja aceite. o FrancÊs faz o mesmo procedimento.
 */
public class Main {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        SwedishBuyer swedishBuyer = new SwedishBuyer(mediator);
        FrenchBuyer frenchBuyer = new FrenchBuyer(mediator);
        float price = 10.0f;

        AmericanSeller americanSeller = new AmericanSeller(mediator, price);
        DollarConverter dollarConverter = new DollarConverter(mediator);

        float licitaçõesCoroas = 60.0f;
        while (!swedishBuyer.attempToPurchase(licitaçõesCoroas)) {
            licitaçõesCoroas += 5.0f;
        }

        float licitaçõesEuro = 2.0f;
        while (!frenchBuyer.attempToPurchase(licitaçõesEuro)) {
            licitaçõesEuro += 0.8f;
        }
    }
}
