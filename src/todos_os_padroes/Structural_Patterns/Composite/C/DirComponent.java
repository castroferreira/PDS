package todos_os_padroes.Structural_Patterns.Composite.C;

import java.util.Enumeration;
import java.util.Vector;

public class DirComponent<E> extends FileSystemComponent {

    Vector<FileSystemComponent> dirContents = new Vector<>();

    public DirComponent(String name) {
        super(name);
    }

    public void addComponent(FileSystemComponent component) throws Exception {
        dirContents.add(component);
    }

    public FileSystemComponent getComponent(int location) throws Exception {
        return (FileSystemComponent) dirContents.elementAt(location);
    }

    @Override
    public long getComponentSize() {
        long totalSize = 0;
        Enumeration<FileSystemComponent> e = dirContents.elements();

        while (e.hasMoreElements()) {
            FileSystemComponent component = (FileSystemComponent) e.nextElement();
            totalSize += (component.getComponentSize());
        }
        return totalSize;
    }
}
