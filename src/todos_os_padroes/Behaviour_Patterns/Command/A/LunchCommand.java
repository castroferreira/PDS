package todos_os_padroes.Behaviour_Patterns.Command.A;

/**
 *
 * Implementa o Command. este contém uma referência para almoço, um recetor. O
 * método execute() invoca a ação apropriada no receptor.
 *
 */
public class LunchCommand implements Command {

    Lunch lunch;

    public LunchCommand(Lunch lunch) {
        this.lunch = lunch;
    }

    @Override
    public void execute() {
        lunch.makeLunch();
    }
}
