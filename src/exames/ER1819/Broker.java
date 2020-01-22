package exames.ER1819;

import java.util.GregorianCalendar;
import java.util.*;

/**
 *
 * @author andreia
 */
class Broker {

    private List<Prestador> prestador;
    private List<Cliente> cliente;
    private List<PedidoServico> servico;

    public Broker() {
        this.prestador = new ArrayList<Prestador>();
        this.cliente = new ArrayList<Cliente>();
        this.servico = new ArrayList<PedidoServico>();
    }

    void adicionarPrestador(Prestador p) {
        prestador.add(p);
    }

    void adicionarCliente(Cliente c) {
        cliente.add(c);
    }

    PedidoServico adicionarPedidoServico(Servico s, Cliente c, GregorianCalendar data) {
        PedidoServico servicos = new PedidoServico(s, c, data);
        servico.add(servicos);

        return servicos;
    }

    @Override
    public String toString() {
        String str = "";

        for (Cliente c : cliente) {
            str = c.toString() + "\n";
        }

        for (Prestador p : prestador) {
            str = p.toString() + "\n";
        }

        for (PedidoServico ps : servico) {
            str = ps.toString() + "\n";
        }

        return str;
    }
}
