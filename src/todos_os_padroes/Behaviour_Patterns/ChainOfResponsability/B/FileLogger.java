package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.B;

/**
 *
 * Subclasse de AbstractLogger e implementa o método write().
 *
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File Console::Logger " + message);
    }
}
