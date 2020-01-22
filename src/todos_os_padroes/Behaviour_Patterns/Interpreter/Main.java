package todos_os_padroes.Behaviour_Patterns.Interpreter;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        Expression isMale = context.getMaleExpression();
        Expression isMarriedWoman = context.getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Julie Married"));
    }
}
