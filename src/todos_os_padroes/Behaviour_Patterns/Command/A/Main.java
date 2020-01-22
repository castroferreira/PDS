package todos_os_padroes.Behaviour_Patterns.Command.A;

/**
 *
 * Instancia um objeto Lunch e cria um LunchCommand com o Lunch (concrete
 * Command). O LunchCommand é referenciado por uma referência de interface
 * Command. Realiza-se o mesmo procedimento com o dinner. Cria-se um objeto
 * MealInvoker com o lunchCommand e chamamos o método invoke() do mealInvoker.
 * Por fim, define-se o comando mealInkover para dinnerCommand e mais uma vez
 * chama-se o invoker() em mealInvoker.
 */
public class Main {

    public static void main(String[] args) {

        Lunch lunch = new Lunch();
        Command lunchCommand = new LunchCommand(lunch);

        Dinner dinner = new Dinner();
        Command dinnerCommand = new DinnerCommand(dinner);

        MealInvoker mealInvoker = new MealInvoker(lunchCommand);
        mealInvoker.invoke();
        mealInvoker.setCommand(dinnerCommand);
        mealInvoker.invoke();
    }
}
