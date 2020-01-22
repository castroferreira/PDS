package todos_os_padroes.Creational_Patterns.Builder.C;

public class MainBuilderEasyMode {

    private static int personID = 1;
    private static String firstName = "Andreia";

    public static void main(String[] args) {
        Person p = new Person.PersonBuilder(personID, firstName).addMiddleName("Castro").addLastName("Ferreira").build();
        System.out.println(p);
    }
}
