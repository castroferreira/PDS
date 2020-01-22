package aulas_praticas.aula06_02;

import java.io.*;
import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class ContactsTXT implements ContactsStorageInterface {

    private File file;

    public ContactsTXT() {
        file = new File("/home/andreia/Dropbox/Engenharia_Informatica/PDS/lab_pds/contacts.txt");
    }

    public ContactsTXT(String filename) {
        file = new File(filename);
    }

    @Override
    public List<Contact> loadContacts() {
        List<Contact> tmp = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                tmp.add(new Contact(sc.next(), sc.next()));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("Nao foi possivel carregar o ficheiro [caminho invalido]");
        }
        return tmp;
    }

    @Override
    public boolean saveContacts(List<Contact> list) {
        boolean tmp = true;

        try {
            PrintWriter pw = new PrintWriter(new FileWriter(file));

            for (Contact c : list) {
                pw.println(c.getName() + "\t" + c.getNumber());
            }

            pw.close();
        } catch (IOException e) {
            System.err.println("Nao foi possivel carregar o ficheiro [caminho invalido]");
            tmp = false;
        }
        return tmp;
    }
}
