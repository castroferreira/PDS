package aulas_praticas.aula09_02;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class RemoveCommand<T> implements Command {

    private Collection<T> collection;
    private T element;

    public RemoveCommand(Collection<T> collection, T element) {
        this.collection = collection;
        this.element = element;
    }

    @Override
    public void execute() {
        collection.remove(element);
        System.out.println(element + "\thas been removed to the list\n");
    }

    @Override
    public void undo() {
        collection.add(element);
        System.out.println("Undo Remove element " + element + "\n");
    }
}
