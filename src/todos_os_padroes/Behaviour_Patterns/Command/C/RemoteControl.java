package todos_os_padroes.Behaviour_Patterns.Command.C;

import java.util.Stack;

public class RemoteControl {

    private CommandInterface command;

    private Stack<CommandInterface> undo = new Stack<>();
    private Stack<CommandInterface> redo = new Stack<>();

    public RemoteControl(CommandInterface command) {
        setCommand(command);
    }

    public void setCommand(CommandInterface command) {
        this.command = command;
    }

    public void executeCommand() {
        redo.clear();
        undo.push(command);
        command.execute();
    }

    public void undoCommand() {
        if (undo.isEmpty()) {
            System.out.println("Nao e possivel fazer undo.");
        } else {
            command.undo();
            redo.push(undo.peek());
        }

    }

    public void redoCommand() {
        if (redo.isEmpty()) {
            System.out.println("Nao e possivel fazer redo.");
        } else {
            command = redo.peek();
            command.redo();
            undo.push(redo.peek());
            redo.pop();
        }
    }
}
