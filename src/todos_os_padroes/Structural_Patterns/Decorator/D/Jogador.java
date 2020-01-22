package todos_os_padroes.Structural_Patterns.Decorator.D;

class Jogador implements JogadorInterface {

    private String name;

    Jogador(String n) {
        name = n;
    }

    @Override
    public void joga() {
        System.out.print("\n" + name + " joga ");
    }
}
