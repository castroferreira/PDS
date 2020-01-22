package aulas_praticas.aula09_01;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {
        VectorGeneric<String> vg = new VectorGeneric<>();

        vg.addElem("Andreia");
        vg.addElem("Rui");
        vg.addElem("Bia");
        vg.addElem("Limas");

        Iterator<String> iterator = vg.Iterator();
        ListIterator<String> listIterator = vg.listIterator(vg.totalElem());

        System.out.println("Iterator Members:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nList Iterator\nFront:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\nBack:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
