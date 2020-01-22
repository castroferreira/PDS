package aulas_praticas.aula05_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Person {

    private final String lastName;      //Optional
    private final String firstName;     //Required
    private final String middleName;    //Optional
    private final String salutation;    //Optional
    private final String suffix;        //Optional
    private final String streetAddress; //Optional
    private final String city;          //Required
    private final String state;         //Optional
    private final boolean isFemale;     //Required
    private final boolean isEmployed;   //Optional
    private final boolean isHomeOwner; //Optional

    public Person(
            final String newLastName,
            final String newFirstName,
            final String newMiddleName,
            final String newSalutation,
            final String newSuffix,
            final String newStreetAddress, final String newCity,
            final String newState,
            final boolean newIsFemale,
            final boolean newIsEmployed,
            final boolean newIsHomeOwner) {

        this.lastName = newLastName;
        this.firstName = newFirstName;
        this.middleName = newMiddleName;
        this.salutation = newSalutation;
        this.suffix = newSuffix;
        this.streetAddress = newStreetAddress;
        this.city = newCity;
        this.state = newState;
        this.isFemale = newIsFemale;
        this.isEmployed = newIsEmployed;
        this.isHomeOwner = newIsHomeOwner;
    }

    private Person(PersonBuilder builder) {
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.salutation = builder.salutation;
        this.suffix = builder.suffix;
        this.streetAddress = builder.streetAddress;
        this.city = builder.city;
        this.state = builder.state;
        this.isFemale = builder.isFemale;
        this.isEmployed = builder.isEmployed;
        this.isHomeOwner = builder.isHomewOwner;
    }

    public static class PersonBuilder {

        // Optional parameters - initialized to default values
        private String lastName = null;         //Optional
        private final String firstName;         //Required
        private String middleName = null;       //Optional
        private String salutation = null;       //Optional
        private String suffix = null;           //Optional
        private String streetAddress = null;    //Optional
        private final String city;              //Required
        private String state = null;            //Optional
        private final boolean isFemale;         //Required
        private boolean isEmployed = false;     //Optional
        private boolean isHomewOwner = false;   //Optional

        //construtor do builder - apenas os parâmetros obrigatórios
        public PersonBuilder(String firstName, String lastName, String streetAddress, String city, boolean isFemale) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.streetAddress = streetAddress;
            this.city = city;
            this.isFemale = isFemale;
        }

        //para os opcionais
        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder salutation(String salutation) {
            this.salutation = salutation;
            return this;
        }

        public PersonBuilder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        public PersonBuilder state(String state) {
            this.state = state;
            return this;
        }

        public PersonBuilder isEmployed(boolean isEmployed) {
            this.isEmployed = isEmployed;
            return this;
        }

        public PersonBuilder isHomewOwner(boolean isHomewOwner) {
            this.isHomewOwner = isHomewOwner;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person: " + "" + firstName + " " + middleName + " " + lastName + ";\nAddress: " + streetAddress + ", " + city + ", " + state + ";\nFemale? " + isFemale + ";\nEmployed? " + isEmployed + ";\nHome Owner? " + isHomeOwner + '.';
    }
}
