package todos_os_padroes.Behaviour_Patterns.Command.C;

public class Main {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(new LightsOffCommand(new Light()));
        remoteControl.executeCommand();
        remoteControl.undoCommand();
        remoteControl.redoCommand();
        remoteControl.undoCommand();
    }
}
