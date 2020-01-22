package todos_os_padroes.Structural_Patterns.Composite.C;

public class Main {

    public static void main(String[] args) {
        FileSystemComponent mainFolder = new DirComponent<Object>("FIRST");
        FileSystemComponent subFolder1 = new DirComponent<Object>("FIRST_1");
        FileSystemComponent subFolder2 = new DirComponent<Object>("FIRST_2");

        FileSystemComponent folderFile1 = new FileComponent("FIRST1_1", 100);
        FileSystemComponent folder2File1 = new FileComponent("FIRST2_1", 200);
        FileSystemComponent folderFile2 = new FileComponent("FIRST1_2", 300);

        try {
            mainFolder.addComponent(subFolder1);
            mainFolder.addComponent(subFolder2);

            subFolder2.addComponent(folder2File1);
            subFolder1.addComponent(folderFile2);
            subFolder1.addComponent(folderFile1);
        } catch (Exception e) {
            System.err.println("Something happened! ERROR.");
        }

        System.out.println("Main Folder size: " + mainFolder.getComponentSize() + " kb");
        System.out.println("Sub Folder1 size: " + subFolder1.getComponentSize() + " kb");
        System.out.println("Sub Folder2 size: " + subFolder2.getComponentSize() + " kb");
    }
}
