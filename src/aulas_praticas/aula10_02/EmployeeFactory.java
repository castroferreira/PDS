package aulas_praticas.aula10_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
class EmployeeFactory {

    public static final String[] names = {"Mac", "Linux", "Win"};

    public static Employee getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new Programmer(name);
            }
        }
        return NullObject.getInstance();
    }
}
