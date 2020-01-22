package aulas_praticas.aula04_T1_02;

import java.util.ArrayList;
import java.util.List;

public class Familia implements Comparable<Familia> {

    private List<Pessoa> membrosFamilia;
    private int nrPortaInicial;
    private int nrPortaFinal;
    private int nrFamilia;
    public static int totalFamilias = 0;

    public Familia(int nrPortaInicial, int nrPortaFinal, String name) {

        this.membrosFamilia = new ArrayList<>();
        this.membrosFamilia.add(new Pessoa(name));
        this.nrPortaInicial = nrPortaInicial;
        this.nrPortaFinal = nrPortaFinal;
        this.nrFamilia = totalFamilias++;

    }

    public int getNrFamilia() {
        return nrFamilia;
    }

    public List<Pessoa> getMembrosFamilia() {
        return membrosFamilia;
    }

    public void addMembroFamilia(Pessoa pessoa) {
        this.membrosFamilia.add(pessoa);
    }

    public int getNrPortaInicial() {
        return this.nrPortaInicial;
    }

    public void setNrPortaInicial(int nrPortaInicial) {
        this.nrPortaInicial = nrPortaInicial;
    }

    public int getNrPortaFinal() {
        return this.nrPortaFinal;
    }

    public void setNrPortaFinal(int nrPortaFinal) {
        this.nrPortaFinal = nrPortaFinal;
    }

    //Util na função map
    public int getComprimento() {
        return this.nrPortaFinal - this.nrPortaInicial;
    }

    @Override
    public String toString() {
        StringBuilder strOut = new StringBuilder();

        for (Pessoa p : this.membrosFamilia) {
            strOut.append(p + " ");
        }
        return strOut.toString();
    }

    @Override
    public int compareTo(Familia t) {
        return t.getComprimento() - this.getComprimento();
    }

}
