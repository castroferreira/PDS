package todos_os_padroes.Behaviour_Patterns.Command.C;

public class LightsOffCommand implements CommandInterface {

    private Light light;

    public LightsOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.setLightOff();
    }

    @Override
    public void undo() {
        light.setLightOn();
    }

    @Override
    public void redo() {
        light.setLightOff();
    }

    @Override
    public String toString() {
        return light.toString();
    }
}
