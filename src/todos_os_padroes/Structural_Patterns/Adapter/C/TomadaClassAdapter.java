package todos_os_padroes.Structural_Patterns.Adapter.C;

public class TomadaClassAdapter extends Tomada implements TomadaAdaptee {

    @Override
    public Watt get120Watts() {
        return getWatt();
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
