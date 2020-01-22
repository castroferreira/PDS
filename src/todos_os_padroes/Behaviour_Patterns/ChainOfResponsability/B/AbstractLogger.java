package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.B;

/**
 *
 * Classe abstrata para a manipulação das subclasses e para que estas possam
 * implementar o método setNextLogger. As subclasses teraão de implementar o
 * métodos write()
 *
 */
public abstract class AbstractLogger {

    public static int info;
    public static int debug;
    public static int error;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
