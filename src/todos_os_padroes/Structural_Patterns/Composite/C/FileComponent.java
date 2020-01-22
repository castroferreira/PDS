package todos_os_padroes.Structural_Patterns.Composite.C;

public class FileComponent extends FileSystemComponent {

    private long size;

    public FileComponent(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public long getComponentSize() {
        return size;
    }
}
