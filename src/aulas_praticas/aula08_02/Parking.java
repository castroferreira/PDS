package aulas_praticas.aula08_02;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Parking {

    private static List<Person> parkingList = new ArrayList<>();

    public static boolean allow(Person person) {
        return parkingList.add(person);
    }

    public static List<Person> showInfo() {
        return Collections.unmodifiableList(parkingList);
    }
}
