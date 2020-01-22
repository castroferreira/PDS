package todos_os_padroes.Behaviour_Patterns.Command.A;

/**
 *
 * Implementa o Command. este contém uma referência para jantar, um recetor. O
 * método execute() invoca a ação apropriada no receptor.
 *
 */
public class DinnerCommand implements Command {

    Dinner dinner;

    public DinnerCommand(Dinner dinner) {
        this.dinner = dinner;
    }

    @Override
    public void execute() {
        dinner.makeDinner();
    }
}
