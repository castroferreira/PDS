package aulas_praticas.aula09_02;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        CollectionUndo undo = new CollectionUndo();

        undo.setCommand(new AddCommand<String>(nameList, "Andreia"));
        undo.doCommand();

        undo.setCommand(new AddCommand<String>(nameList, "Ana"));
        undo.doCommand();

        undo.setCommand(new AddCommand<String>(nameList, "Bia"));
        undo.doCommand();

        undo.setCommand(new AddCommand<String>(nameList, "Rui"));
        undo.doCommand();

        undo.setCommand(new AddCommand<String>(nameList, "Miguel"));
        undo.doCommand();

        undo.setCommand(new AddCommand<String>(nameList, "Joao"));
        undo.doCommand();

        undo.setCommand(new AddCommand<String>(nameList, "Renato"));
        undo.doCommand();

        undo.setCommand(new RemoveCommand<String>(nameList, "Renato"));
        undo.doCommand();

        System.out.println("Current list elements");
        for (String list : nameList) {
            System.out.println(list);
        }

        System.out.println("Undo to all commands");
        undo.undo();

        for (String list : nameList) {
            System.out.println(list);
        }

        try {
            undo.undo();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
