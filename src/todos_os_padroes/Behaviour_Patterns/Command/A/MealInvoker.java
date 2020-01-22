package todos_os_padroes.Behaviour_Patterns.Command.A;

/**
 *
 *Classe invoker. 
 *Contém uma referência para o Command para o invocar.
 * o metodo invoke() chama o método execute() do Command
 */
public class MealInvoker {
    
    Command command;

    public MealInvoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void invoke(){
        command.execute();
    }
}
