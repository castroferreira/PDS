package todos_os_padroes.Behaviour_Patterns.NullObject.A;

public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available in customer database!!";
    }
}
