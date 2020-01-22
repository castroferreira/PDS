package aulas_praticas.aula08_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
class BankAccountImpl implements BankAccount {

    private String bank;
    private double balance;

    BankAccountImpl(String bank, double initialDeposit) {
        this.bank = bank;
        balance = initialDeposit;
    }

    public String getBank() {
        return bank;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    @Override
    public double balance() {
        return balance;
    }
}
