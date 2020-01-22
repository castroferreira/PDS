package todos_os_padroes.Behaviour_Patterns.NullObject.B;

public class RealUser implements User {

    private String name;

    public RealUser(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
