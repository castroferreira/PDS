package todos_os_padroes.Behaviour_Patterns.Strategy.A;

public class Main {

    public static void main(String[] args) {

        int temperaturaF = 60;

        Strategy strategy = new SkiStrategy();
        Context context = new Context(strategy, temperaturaF);
        System.out.println("A temperatura " + context.getTemperaturaF() + " F é ideal para fazr ski? " + context.getResult());

        Strategy strategy1 = new HikeStrategy();
        Context context1 = new Context(strategy1, temperaturaF);
        System.out.println("A temperatura " + context1.getTemperaturaF() + " F é ideal para fazr hike? " + context1.getResult());
    }
}
