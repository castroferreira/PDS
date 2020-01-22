package aulas_praticas.aula08_01_b;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class BankAccountProxy implements BankAccount {

    private BankAccountImpl account;

    public BankAccountProxy(String accountName, double initialDeposit) {
        account = new BankAccountImpl(accountName, initialDeposit);
    }

    @Override
    public void deposit(double amount) {
        account.deposit(amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (Company.user == User.COMPANY) {
            throw new UnsupportedOperationException("A company cannot withdraw");
        }

        return account.withdraw(amount);
    }

    @Override
    public double balance() {
        if (Company.user == User.COMPANY) {
            throw new UnsupportedOperationException("A company cannot consult balance");
        }

        return account.balance();
    }
}
