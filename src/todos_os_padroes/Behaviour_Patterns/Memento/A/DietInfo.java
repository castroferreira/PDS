package todos_os_padroes.Behaviour_Patterns.Memento.A;

/**
 *
 * Esta classe é a Originator. O objetivo é ser capaz de salvar e restaurar o
 * seu estado. Contem 3 campos: nome, dias de dieta e peso no dia especifico.
 * contem uma classe interna privada chamada Memento. Esta classeé usada para
 * salvar o estado de DietInfo e contem os 3 campos. o dietInfo contem um metodo
 * save() -> cria e retorna um objeto mementoque é armazenado pelo careTaker.
 * metodo restore() -> usado para restaurar o estado do DietInfo. Como o
 * DietInfo.Memento não é visivel, então o caretaker não pode fazer referencia a
 * este, logo a referencia é armazenada através de um objeto.
 */
public class DietInfo {

    String nome;
    int diasDieta;
    int peso;

    public DietInfo(String nome, int diasDieta, int peso) {
        this.nome = nome;
        this.diasDieta = diasDieta;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "DietInfo{" + "nome=" + nome + ", diasDieta=" + diasDieta + ", peso=" + peso + '}';
    }

    public void setDiaDietaPeso(int diaDieta, int peso) {
        this.diasDieta = diaDieta;
        this.peso = peso;
    }

    public Memento save() {
        return new Memento(nome, diasDieta, peso);
    }

    public void restore(Object objMemento) {
        Memento memento = (Memento) objMemento;

        nome = memento.mementoNome;
        diasDieta = memento.mementoDiaDieta;
        peso = memento.mementoPeso;
    }

    private class Memento {

        String mementoNome;
        int mementoDiaDieta;
        int mementoPeso;

        public Memento(String nome, int diaDieta, int peso) {
            mementoNome = nome;
            mementoDiaDieta = diaDieta;
            mementoPeso = peso;
        }
    }
}
