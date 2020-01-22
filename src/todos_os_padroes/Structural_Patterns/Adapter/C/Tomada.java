package todos_os_padroes.Structural_Patterns.Adapter.C;

public class Tomada {

    public Watt getWatt() {
        return new Watt(120);
    }
}
