/**
 * PDS 2018
 *
 */
package aulas_praticas.aula03_02;

import java.io.*;
import java.util.*;

public class Street implements Comparator<FamilyMember> {

    private ArrayList<FamilyMember> member;
    private final Map<Integer, ArrayList<FamilyMember>> street;
    private final int[] doorNumber = new int[2];

    /**
     * Constructor
     */
    public Street() {
        member = new ArrayList<>();
        street = new HashMap<>();
        doorNumber[0] = 1;
        doorNumber[1] = 1;
    }

    /**
     * Commands:
     *
     * 1. LOAD
     *
     * Dois membros com o mesmo intervalo sao da mesma familia. Le um ficheiro
     * de texto para contruir a representacao da rua NumeroInicial-NumeroFinal
     * Nome > Exemplo 1-5 andreia 2-4 rui
     *
     * [x1-x2], 0<x1<x2
     *
     * @param filename
     * @throws java.io.FileNotFoundException
     */
    public void load(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            if (!line.startsWith(">")) {
                String[] input = line.split("\\s+");
                String[] doors = input[0].split("-");

                add(input[1], Integer.parseInt(doors[0]), Integer.parseInt(doors[1]));
            }
        }
    }

    /**
     * 2. MAP
     *
     * Se dois (ou mais) membros de uma família começarem no mesmo valor, o que
     * tem o maior alcance aparece no lado esquerdo. Se tiverem o mesmo
     * intervalo de comprimento, são considerados da mesma família. Cada local
     * ocupado por uma família deve ser separado por dois pontos.
     */
    public void map() {
        ArrayList<FamilyMember> fm = new ArrayList<>();

        for (int i = 1; i <= doorNumber[1]; i++) {
            street.put(i, new ArrayList<FamilyMember>());

            for (FamilyMember m : member) {
                if (m.getDoorNumber()[0] <= i && m.getDoorNumber()[1] >= i) {
                    street.get(i).add(m);
                }
            }

            ArrayList<FamilyMember> fm1 = street.get(i);
            fm1 = sortDoorNumber(fm1);
            street.put(i, fm1);
        }

        for (int i = 1; i <= doorNumber[1]; i++) {
            boolean isSameFamily = false;
            fm = street.get(i);
            System.out.println(i + " : ");

            for (int j = 0; j < fm.size(); j++) {
                isSameFamily = false;

                // Vai verificar se já foram imprimidos membros da familia
                for (int k = 0; k < j; k++) {
                    if (fm.get(k).isSameFamily(fm.get(j))) {
                        isSameFamily = true;
                    }
                }

                if (isSameFamily == false) {
                    for (String tmp : fm.get(j).getMemberList()) {
                        fm.remove(tmp);
                        System.out.println(tmp + " ");
                    }
                    System.out.println(" : ");
                }
            }

            System.out.println();
        }
    }

    /**
     * 3. ADD
     *
     * Add nome xl x2 : cria um novo membro na localização x1, x2. Se o membro
     * já existir deve ser reportado um erro.
     *
     * @param name
     * @param x1
     * @param x2
     */
    public void add(String name, int x1, int x2) {
        FamilyMember fm = new FamilyMember(name, x1, x2);

        if (!containsMember(fm)) {
            for (FamilyMember m : member) {
                if (m.isSameFamily(fm)) {
                    m.addFamilyMember(fm.getName());
                    fm.addFamilyMember(m.getName());
                    Collections.sort(fm.getMemberList());
                }
            }
            member.add(fm);

            if (fm.getDoorNumber()[1] > doorNumber[1]) {
                doorNumber[1] = fm.getDoorNumber()[1];
            }
        } else {
            System.err.println(name + " already existe.");
        }
    }

    /**
     * 4. Remove
     *
     * Remove um membro da família. Se o membro não existir deve ser reportado
     * um erro.
     *
     * @param name
     */
    public void remove(String name) {
        boolean sameFamily = false;

        for (FamilyMember m : member) {
            m.getMemberList().remove(name);

            if (m.getName().equals(name)) {
                member.remove(m);
                sameFamily = false;
                break;
            }
        }

        if (sameFamily == false) {
            System.out.println(name + " doesn't exists.");
        }
    }

    /**
     * 5. List
     *
     * Apresenta todos os nomes e números de porta, ordenados alfabeticamente.
     */
    public void list() {
        member = sortName(member);

        for (FamilyMember m : member) {
            System.out.println(m.getName() + " " + m.getDoorNumber()[0] + " " + m.getDoorNumber()[1]);
        }
    }

    /**
     * 6. Lookup
     *
     * Procura um habitante e apresenta a informação da família x1 x2 : name1
     * name2
     *
     * @param name
     */
    public void lookup(String name) {
        for (FamilyMember m : member) {
            if (m.getName().equals(name)) {
                System.out.println(m.getDoorNumber()[0] + " " + m.getDoorNumber()[1] + " : " + name + " ");

                for (String s : m.getMemberList()) {
                    System.out.println(s + " ");
                }
                System.out.println();
            }
        }
    }

    /**
     * 7. Clear
     *
     * Limpa toda a informação da rua.
     */
    public void clear() {
        member.clear();
        street.clear();
        doorNumber[0] = 1;
        doorNumber[1] = 1;
    }

    /**
     * 8. Quit
     *
     * Termina o programa.
     */
    public void quit() {
        System.exit(0);
    }

    /**
     * Funções auxiliares:
     *
     * @param m1
     * @param m2
     * @return
     */
    @Override
    public int compare(FamilyMember m1, FamilyMember m2) {
        return m1.compareTo(m2);
    }

    public ArrayList<FamilyMember> sortDoorNumber(ArrayList<FamilyMember> m) {
        Collections.sort(m);
        return m;
    }

    public ArrayList<FamilyMember> sortName(ArrayList<FamilyMember> m) {
        Collections.sort(m, new CompareByName());
        return m;
    }

    //Verifica se um membro existe na lista dos membros da familia
    public boolean containsMember(FamilyMember fm) {
        for (FamilyMember m : member) {
            if (fm.equals(m)) {
                return true;
            }
        }
        return false;
    }
}
