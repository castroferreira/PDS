package todos_os_padroes.Behaviour_Patterns.NullObject.B;

public class NullUser implements User {

    private String name;

    public NullUser(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "User " + name + " is not available in our database.";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
