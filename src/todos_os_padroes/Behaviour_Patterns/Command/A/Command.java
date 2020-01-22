package todos_os_padroes.Behaviour_Patterns.Command.A;

/**
 *
 * O padrão command pode ser usado para executar a funcionalidade de "Undo-
 * Retroceder". A interface command dever incluir um metudo execute();
 */
public interface Command {

    public void execute();
}
