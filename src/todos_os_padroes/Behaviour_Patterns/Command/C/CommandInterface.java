package todos_os_padroes.Behaviour_Patterns.Command.C;

public interface CommandInterface {

    public void execute();

    public void undo();

    public void redo();
}
