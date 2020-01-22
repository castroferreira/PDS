package todos_os_padroes.Behaviour_Patterns.NullObject.B;

public class UserFactory {

    public static User getUser(String name) {
        String[] names = {"Andreia", "Hugo", "Daniel"};
        for (String n : names) {
            if (name.equals(n)) {
                return new RealUser(name);
            }
        }
        return new NullUser(name);
    }
}
