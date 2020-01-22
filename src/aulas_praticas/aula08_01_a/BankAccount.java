package aulas_praticas.aula08_01_a;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public interface BankAccount {

    void deposit(double amount);

    boolean withdraw(double amount);

    double balance();
}
