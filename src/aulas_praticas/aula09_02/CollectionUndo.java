package aulas_praticas.aula09_02;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class CollectionUndo {

    private Stack<Command> command = new Stack<Command>();
    private Command undo;

    public void undo() {
        if (!command.isEmpty()) {
            command.pop().undo();
        } else {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    public void setCommand(Command c) {
        undo = c;
    }

    public void doCommand() {
        undo.execute();
        command.push(undo);
    }
}
