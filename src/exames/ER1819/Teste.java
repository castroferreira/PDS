package exames.ER1819;

import java.util.GregorianCalendar;

//Nao alterar esta classe
//Mas pode (Deve!) comentar linhas com erros para poder testar o codigo que for desenvolvendo
public class Teste {

    public static void main(String[] args) {

        // ALINEA A
        Cliente cliente1 = new Cliente("Pedro Silva", "pedro@edp.pt");
        Cliente cliente2 = new Cliente("Alexandre Mestre", "alexandre@edp.pt");
        Cliente cliente3 = new Cliente("Maria Matos", "maria@infra.pt");

        Prestador prestador1 = new Prestador("Jorge Lopes", "jorge.lopes@ua.pt", TipoServico.LIMPEZA);
        Prestador prestador2 = new Prestador("Ana Martins", "anamartins@gmail.com", TipoServico.APOIO_DOMICILIO);
        Prestador prestador3 = new Prestador("Sandra Costa", "sandra.costa@gmail.com", TipoServico.APOIO_DOMICILIO);

        Servico servico1 = new Servico("Limpeza 1/2 dia", "Limpeza ao domicilio", 40.0, TipoServico.LIMPEZA);
        Servico servico2 = new Servico("Babysitting (4h)", "Tomar conta de bebes", 50.0, TipoServico.APOIO_DOMICILIO);
        Servico servico3 = new Servico("Senior+", "Apoio domicilizario a idosos", 55.0, TipoServico.APOIO_DOMICILIO);

//        System.out.println(cliente1);
//        System.out.println(cliente2);
//        System.out.println(cliente3);
//        System.out.println(prestador1);
//        System.out.println(prestador2);
//        System.out.println(prestador3);
//        System.out.println(servico1);
//        System.out.println(servico2);
//        System.out.println(servico3);

        // ALINEA B
        Broker broker = new Broker();
        broker.adicionarPrestador(prestador1);
        broker.adicionarPrestador(prestador2);
        broker.adicionarPrestador(prestador3);
        broker.adicionarCliente(cliente1);
        broker.adicionarCliente(cliente2);
        broker.adicionarCliente(cliente3);

        PedidoServico pedido1 = broker.adicionarPedidoServico(servico1, cliente1, new GregorianCalendar(2019, 07, 01));
        PedidoServico pedido2 = broker.adicionarPedidoServico(servico2, cliente2, new GregorianCalendar(2019, 07, 01));
        PedidoServico pedido3 = broker.adicionarPedidoServico(servico3, cliente3, new GregorianCalendar(2019, 07, 02));

        System.out.println("\n>> Alinea B");
        System.out.println(broker);

        // ALINEA C
        System.out.println(">> Alinea C");
        pedido1.associar(prestador1);
        pedido1.associar(prestador2);
        pedido1.fechar();
        System.out.println();

        pedido1.escolherPrestador(prestador1);
        System.out.println();

        System.out.println(">> Alinea D... exceções!");
    }
}
