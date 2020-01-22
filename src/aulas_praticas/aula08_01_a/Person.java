package aulas_praticas.aula08_01_a;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
class Person {

    private String name;
    private BankAccount bankAccount;

    public Person(String n) {
        name = n;
        bankAccount = new BankAccountImpl("PeDeMeia", 0);
    }

    public String getName() {
        return name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
