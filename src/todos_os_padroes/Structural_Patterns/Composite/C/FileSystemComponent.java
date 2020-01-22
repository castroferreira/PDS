package todos_os_padroes.Structural_Patterns.Composite.C;

public abstract class FileSystemComponent {

    private String name;

    public FileSystemComponent(String name) {
        setName(name);
    }

    public void addComponent(FileSystemComponent component) throws Exception {
        throw new Exception("Invalid Operation. Not Supported");
    }

    public FileSystemComponent getComponent(int componentNum) throws Exception {
        throw new Exception("Invalid Operation. Not Supported");
    }

    public abstract long getComponentSize();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
