package Exame;

public class Solver extends Observer {

    private String firstName, lastName, email;
    private Organization org;

    public Solver(String firstName, String lastName, String email, Organization org) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.org = org;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Organization getOrg() {
        return org;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public void sendMessage(Seeker seeker, String message) {
        System.out.println(". Hello " + this.getFirstName() + " -> " + seeker.getName() + " says: " + message);
    }

    public String toString() {
        return "Solver [name=" + firstName + " " + lastName + ", email=" + email + ", org=" + org + "]";
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
