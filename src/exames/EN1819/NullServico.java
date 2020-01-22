package exames.EN1819;

/**
 *
 * @author andreia
 */
public class NullServico implements Servico{

    NullServico() {
    }

    @Override
    public String nome() {
        return null;
    }

    @Override
    public String descricao() {
        return null;
    }

    @Override
    public double valor() {
        return 0;
    }

    @Override
    public String toString() {
        return "ServicoVazio [" +
                "nome=nao existe"  +
                ", descricao=nao existe"  +
                ", preco=" + 0.0 +
                "],";
    }
}