package todos_os_padroes.Structural_Patterns.Adapter.C;

public class TomadaObjectAdapter implements TomadaAdaptee {

    private Tomada tomada = new Tomada();

    @Override
    public Watt get120Watts() {
        return tomada.getWatt();
    }

    @Override
    public Watt get12Watts() {
        return new Watt(12);
    }

    @Override
    public Watt get3Watts() {
        return new Watt(3);
    }
}
