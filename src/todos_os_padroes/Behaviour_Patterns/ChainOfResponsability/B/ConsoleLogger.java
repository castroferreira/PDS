package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.B;

/**
 *
 * Subclasse de AbstractLogger e implementa o método write().
 *
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard console:: Logger: " + message);
    }
}
