package exames.ER1819;

import java.util.*;

/**
 *
 * @author andreia
 */
class PedidoServico {

    private Servico servico;
    private Cliente cliente;
    private GregorianCalendar data;
    private EstadoServico estado;
    private List<Prestador> prestador;

    public PedidoServico(Servico servico, Cliente cliente, GregorianCalendar data) {
        this.servico = servico;
        this.cliente = cliente;
        this.data = data;
        estado = EstadoServico.ABERTO;
        prestador = new ArrayList<Prestador>();
    }

    void associar(Prestador p) {
        prestador.add(p);
    }

    void fechar() {
        if (estado.equals(estado.ABERTO)) {
            estado = EstadoServico.FECHADO;
            System.out.println(fecho());
            return;
        }
        System.out.println("Nao e permitido fechar pedidos que nao estejam aberto.\nEstado atual do pedido:" + estado + "\n");
    }

    void escolherPrestador(Prestador p) {
        if (!p.getTipo().equals(servico.getTipo())) {
            System.out.println("O prestador nao e compativel com o servico pedido.\nTipo de pedido: "
                    + servico.getTipo() + "\nTipo de servico do prestador selecionado: " + p.getTipo());
        }

        if (estado.equals(estado.FECHADO)) {
            estado = EstadoServico.CONCLUIDO;
            System.out.println(escolha(p));
            return;
        }
    }

    @Override
    public String toString() {
        String str = "";

        str += "PedidoServico [" + "\n " + servico + ", estado=" + estado + ", ";

        if (prestador.isEmpty()) {
            str += "\n .Prestador [" + "nome=a definir, email=a definir, tipoServico=" + TipoServico.INDEFINIDO + "]";
        } else {
            str += prestador;
        }
        str += ", date=" + data.get(Calendar.DAY_OF_MONTH) + "/" + data.get(Calendar.MONTH) + ",\n " + cliente + "\n" +']';
        return str;
    }

    //Metodos auxiliares
    private String fecho() {
        String str = "";

        str += "Ola " + cliente.getNome() + " -> O pedido de servico de " + servico.getTitulo() + " do cliente " + cliente.getNome() + " encerrou.\n";

        for (Prestador p : prestador) {
            str += "Ola " + p.getNome() + " -> O pedido de servico de " + servico.getTitulo() + " do cliente " + cliente.getNome() + " encerrou.\n";
        }

        return str;
    }

    private String escolha(Prestador prestador_escolhido) {
        String str = "";

        str += "Ola " + cliente.getNome() + " -> O prestador do servico de " + servico.getTitulo() + " do cliente " + cliente.getNome() + " escolhido foi " + prestador_escolhido.getNome() + ".\n";

        for (Prestador p : prestador) {
            str += "Ola " + p.getNome() + " -> O prestador do servico de " + servico.getTitulo() + " do cliente " + cliente.getNome() + " escolhido foi " + prestador_escolhido.getNome() + ".\n";
        }

        return str;
    }
}
