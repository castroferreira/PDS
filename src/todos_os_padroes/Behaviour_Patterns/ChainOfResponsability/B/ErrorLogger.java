package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.B;

/**
 *
 * Subclasse de AbstractLogger e implementa o método write().
 *
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
