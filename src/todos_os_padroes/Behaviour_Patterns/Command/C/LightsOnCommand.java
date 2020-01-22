package todos_os_padroes.Behaviour_Patterns.Command.C;

public class LightsOnCommand implements CommandInterface {

    private Light light;

    public LightsOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.setLightOn();
    }

    @Override
    public void undo() {
        light.setLightOff();
    }

    @Override
    public void redo() {
        light.setLightOn();
    }

    @Override
    public String toString() {
        return light.toString();
    }
}
