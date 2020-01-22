/**
 * PDS 2018
 *
 */
package aulas_praticas.aula03_02;

import java.util.*;

public class FamilyMember implements Comparable<FamilyMember> {

    /**
     * Dois membros com o mesmo intervalo sao da mesma familia.
     * NumeroInicial-NumeroFinal Nome > Exemplo 1-5 andreia 2-4 rui
     *
     * [x1-x2], 0<x1<x2
     */
    private final ArrayList<String> memberList = new ArrayList<>();
    private String name;
    private int[] doorNumber = new int[2];
    //private int initialNumber, finalNumber;
    private final ValidatorName valid = new ValidatorName();

    public FamilyMember(String name, int x1, int x2) {
        //O numero da porta comeca em 1!
        if (x1 == 0 || x1 < 0) {
            x1 = 1;
        }

        if (x2 == 0 || x2 < 0) {
            x2 = 1;
        }
        //[x1-x2], 0<x1<x2
        if (x1 < x2) {
            doorNumber[0] = x1;
            doorNumber[1] = x2;
        } else {
            doorNumber[0] = x2;
            doorNumber[1] = x1;
        }

        //Só permite os nomes que cumpram os requisitos pedidos:
        if (valid.validName(name)) {
            this.name = this.name;
            memberList.add(name);
        }
    }

    public ArrayList<String> getMemberList() {
        return memberList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int[] doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void addFamilyMember(String member) {
        memberList.add(member);
    }

    public boolean isSameFamily(FamilyMember m) {
        return doorNumber[0] == m.getDoorNumber()[0] && doorNumber[1] == m.getDoorNumber()[1];
    }

    @Override
    public int compareTo(FamilyMember m) {
        /**
         * Se os primeiros numeros dos intervalos (numeros das portas) forem
         * iguais, compara pelos ultimos numeros
         */

        if (doorNumber[0] == m.getDoorNumber()[0]) {
            return m.getDoorNumber()[1] - doorNumber[1];
        }
        return m.getDoorNumber()[0] - doorNumber[0];
    }
}
