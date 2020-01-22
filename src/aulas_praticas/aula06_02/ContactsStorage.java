package aulas_praticas.aula06_02;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class ContactsStorage implements ContactsInterface {

    private List<Contact> contacts;
    private ContactsStorageInterface contactsStorage;

    public ContactsStorage(ContactsStorageInterface contactsStorage) {
        contacts = new ArrayList<>();
        this.contactsStorage = contactsStorage;
    }

    ContactsStorage() {
        contacts = new ArrayList<>();
        contactsStorage = null;
    }

    @Override
    public void openAndLoad(ContactsStorageInterface store) {
        contacts = store.loadContacts();
        contactsStorage = store;
    }

    @Override
    public void saveAndClose() {
        if (contactsStorage != null) {
            if (contactsStorage.saveContacts(contacts)) {
                System.out.println("O contacto foi guardado.");
            } else {
                System.out.println("O contacto nao foi guardado.");
            }
        } else {
            System.err.println("--erro--");
        }
    }

    @Override
    public void saveAndClose(ContactsStorageInterface store) {
        if (contactsStorage.saveContacts(contacts)) {
            System.out.println("O contacto foi guardado.");
        } else {
            System.out.println("O contacto nao foi guardado.");
        }
    }

    @Override
    public boolean exist(Contact contact) {
//        for(Contact c : contacts)
//            if(c.equals(contact))
//                return true;
//
//        return false;

        return contacts.equals(contact);
    }

    @Override
    public Contact getByName(String name) {
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                return c;
            }
        }

        return null;
    }

    @Override
    public boolean add(Contact contact) {
//        boolean tmp = false;
//        
//        if(!exist(contact)){
//            contacts.add(contact);
//            tmp = true;
//        }
//        return tmp;

        contacts.add(contact);
        return contacts.equals(contact);
    }

    @Override
    public boolean remove(Contact contact) {
        return contacts.remove(contact);
    }
}
