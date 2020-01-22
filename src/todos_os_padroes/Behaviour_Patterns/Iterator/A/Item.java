package todos_os_padroes.Behaviour_Patterns.Iterator.B;

/**
 *
 * Representa um item num menu. Um item tem um nome e um preço
 */
public class Item {

    String nome;
    float preco;

    public Item(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + ":$" + preco;
    }
}
