package todos_os_padroes.Structural_Patterns.Decorator.D;

class Xadrezista extends JogDecorator {

    Xadrezista(JogadorInterface j) {
        super(j);
    }

    @Override
    public void joga() {
        j.joga();
        System.out.print("xadrez ");
    }
}