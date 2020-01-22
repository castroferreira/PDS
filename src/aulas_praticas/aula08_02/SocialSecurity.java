package aulas_praticas.aula08_02;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class SocialSecurity {

    private static List<Person> socialSecurityList = new ArrayList<>();

    public static boolean regist(Person person) {
        return socialSecurityList.add(person);
    }

    public static List<Person> showInfo() {
        return Collections.unmodifiableList(socialSecurityList);
    }
}
