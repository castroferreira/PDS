package aulas_praticas.aula06_02;

import java.io.*;
import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class ContactsBIN implements ContactsStorageInterface {

    private File file;

    public ContactsBIN() {
        file = new File("/home/andreia/Dropbox/Engenharia_Informatica/PDS/lab_pds/contacts.bin");
    }

    public ContactsBIN(String filename) {
        file = new File(filename);
    }

    @Override
    public List<Contact> loadContacts() {
        //List<Contact> tmp = new ArrayList<>();
        List<Contact> tmp = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            fis.close();
        } catch (Exception e) {
            System.err.println("Erro" + e.getMessage());
        }
        return tmp;
    }

    @Override
    public boolean saveContacts(List<Contact> list) {
        boolean tmp = false;

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream dos = new ObjectOutputStream(fos);
            dos.writeObject(list);
            fos.close();
            tmp = true;
        } catch (FileNotFoundException e) {
            System.err.println("Erro" + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro" + e.getMessage());
        }

        return tmp;
    }
}
