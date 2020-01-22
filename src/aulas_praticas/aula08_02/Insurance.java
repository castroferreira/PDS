package aulas_praticas.aula08_02;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Insurance {

    private static List<Person> insuranceList = new ArrayList<>();

    public static boolean regist(Person person) {
        return insuranceList.add(person);
    }

    public static List<Person> showInfo() {
        return Collections.unmodifiableList(insuranceList);
    }
}
