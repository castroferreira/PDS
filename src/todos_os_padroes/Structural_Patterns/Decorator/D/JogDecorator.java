package todos_os_padroes.Structural_Patterns.Decorator.D;

abstract class JogDecorator implements JogadorInterface {

    protected JogadorInterface j;

    JogDecorator(JogadorInterface j) {
        this.j = j;
    }

    public void joga() {
        j.joga();
    }
}
