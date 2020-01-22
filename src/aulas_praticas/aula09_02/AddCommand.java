package aulas_praticas.aula09_02;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class AddCommand<T> implements Command {

    private Collection<T> collection;
    private T element;

    public AddCommand(Collection<T> collection, T element) {
        this.collection = collection;
        this.element = element;
    }

    @Override
    public void execute() {
        collection.remove(element);
        System.out.println(element + "\thas been added to the list\n");
    }

    @Override
    public void undo() {
        collection.add(element);
        System.out.println("Undo Add element " + element + "\n");
    }
}
