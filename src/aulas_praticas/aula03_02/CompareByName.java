/**
 * PDS 2018
 *
 */
package aulas_praticas.aula03_02;

import java.util.Comparator;

public class CompareByName implements Comparator<FamilyMember> {

    @Override
    public int compare(FamilyMember m1, FamilyMember m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
