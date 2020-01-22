package aulas_praticas.aula06_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {
        System.err.println("Teste 1");
        ContactsInterface contacts = new ContactsStorage(new ContactsTXT("/home/andreia/Dropbox/Engenharia_Informatica/PDS/lab_pds/contacts.txt"));
        contacts.add(new Contact("Andreia", "65791"));
        contacts.add(new Contact("Rui", "42872"));
        contacts.add(new Contact("Bia", "67657"));
        contacts.add(new Contact("Joao", "68973"));
        contacts.remove(new Contact("Hugo", "60395"));
        System.out.println(contacts.getByName("Ana"));
        contacts.saveAndClose();

        System.err.println("Teste 2");
        ContactsInterface contacts1 = new ContactsStorage();
        contacts1.openAndLoad(new ContactsTXT("/home/andreia/Dropbox/Engenharia_Informatica/PDS/lab_pds/contacts.txt"));
        contacts1.add(new Contact("Serrano", "27824"));
        contacts1.add(new Contact("Borrego", "75676"));
        contacts1.add(new Contact("Limas", "37986"));
        System.out.println(contacts1.getByName("Miguel"));
        contacts1.saveAndClose(new ContactsBIN("/home/andreia/Dropbox/Engenharia_Informatica/PDS/lab_pds/contacts.bin"));

        System.err.println("Teste 3");
        ContactsInterface contacts2 = new ContactsStorage();
        contacts2.openAndLoad(new ContactsBIN("/home/andreia/Dropbox/Engenharia_Informatica/PDS/lab_pds/contacts.bin"));
        
        if (contacts2.add(new Contact("Neto", "59306"))) 
            System.out.println("O contacto nao foi adicionado a lista");
        
        System.out.println(contacts2.getByName("Daniel"));
    }
}
