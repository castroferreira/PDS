package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.C;

import java.util.Scanner;

public class Main {

    private static Scanner input;

    public static void main(String[] args) {

        DispenseChain chain = new Euro50Dispenser(new Euro20Dispenser(new Euro10Dispenser(null)));

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                System.exit(1);
            }
            // process the request
            chain.dispense(amount);
        }
    }
}
