package todos_os_padroes.Behaviour_Patterns.Command.C;

public class Light {

    private boolean isLightOn;

    public Light() {

    }

    public void setLightOn() {
        this.isLightOn = true;
        System.out.println("The light is on: " + isLightOn);
    }

    public void setLightOff() {
        this.isLightOn = false;
        System.out.println("The light is on: " + isLightOn);
    }

    @Override
    public String toString() {
        return "The lights are on: " + isLightOn;
    }
}
