package todos_os_padroes.Creational_Patterns.Builder.C;

public class Person {

    private final int personID;
    private final String firstName;
    private final String middleName;
    private final String lastName;

    private Person(PersonBuilder builder) {
        this.personID = builder.personID;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public int getPersonID() {
        return personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("ID: " + personID).append("\n");
        str.append("firstName: " + firstName).append("\n");

        if (middleName != null) {
            str.append("middleName: " + middleName).append("\n");
        }
        if (lastName != null) {
            str.append("lastName: " + lastName).append("\n");
        }
        return str.toString();
    }

    public static class PersonBuilder {

        private int personID;
        private String firstName;
        private String middleName;
        private String lastName;

        public PersonBuilder(int personID, String firstName) {
            this.personID = personID;
            this.firstName = firstName;
        }

        public PersonBuilder addMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder addLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person build() {
            Person p = new Person(this);
            return p;
        }
    }
}
