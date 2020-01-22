package aulas_praticas.aula06_02;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public interface ContactsInterface {

    public void openAndLoad(ContactsStorageInterface store);

    public void saveAndClose();

    public void saveAndClose(ContactsStorageInterface store);

    public boolean exist(Contact contact);

    public Contact getByName(String name);

    public boolean add(Contact contact);

    public boolean remove(Contact contact);
}
