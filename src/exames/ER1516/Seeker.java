package Exame;

public class Seeker extends Observer {

    private String name, email;
    private Organization org;

    public Seeker(String name, String email, Organization org) {
        super();
        this.name = name;
        this.email = email;
        this.org = org;
        
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Organization getOrg() {
        return org;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void sendMessage(Seeker seeker, String message) {
        System.out.println(". Hello " + this.getName() + " -> " + seeker.getName() + " says: " + message);
    }

    public String toString() {
        return "Seeker [name=" + name + ", email=" + email + "]";
    }

    @Override
    public void update() {
        
    }

}
