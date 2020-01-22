package todos_os_padroes.Behaviour_Patterns.ChainOfResponsability.B;

public class Main {

    public static void main(String[] args) {
        AbstractLogger abstractLogger = getChainLoggers();

        abstractLogger.logMessage(AbstractLogger.error, "This is an error information!!");
        abstractLogger.logMessage(AbstractLogger.debug, "This is an debug information!!");
        abstractLogger.logMessage(AbstractLogger.info, "This is an information!!");
    }

    public static AbstractLogger getChainLoggers() {

        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.info);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.error);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.debug);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
