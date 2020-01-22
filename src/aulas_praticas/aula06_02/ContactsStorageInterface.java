package aulas_praticas.aula06_02;

import java.util.List;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
interface ContactsStorageInterface {

    List<Contact> loadContacts();

    boolean saveContacts(List<Contact> list);
}
