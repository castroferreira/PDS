package Exame;

import java.util.HashMap;
import java.util.Map;

public class Pauta {

    private UnidadeCurricular uc;
    private String data;
    private Map<Aluno, Integer> notas; // <nMec, nota>

    /*Dicionario de notas:
	 * -1 -> nota n�o atribu�da
	 * 66 -> reprovou por nota minima
	 * 77 -> faltou
	 * 88 -> desistiu
	 * 99 -> reprovou por faltas
     */
    public Pauta(UnidadeCurricular uc, String data) {
        this.uc = uc;
        this.notas = new HashMap<Aluno, Integer>();
        this.data = data;
    }

    
    public UnidadeCurricular getUnidadeCurricular() {
        return uc;
    }

    public String getData() {
        return data;
    }

    public boolean adicionarAluno(Aluno a, int n) {

        if (!notas.containsKey(a)) {
            notas.put(a, n);
            return true;
        }
        return false;
    }

    public boolean removerAluno(Aluno a) {

        for (Map.Entry<Aluno, Integer> aluno : notas.entrySet()) {
            Aluno key = aluno.getKey();
            Integer value = aluno.getValue();
            if (notas.containsKey(key)) {
                notas.remove(key, value);
            }
        }
        return false;
    }

    public int getNota(Aluno a) {
        return notas.get(a);
    }

    public boolean setNota(Aluno a, int nota) {
        if (notas.containsKey(a)) {
            int nota_antiga = notas.get(a);
            return notas.replace(a, nota_antiga, nota);
        }
        return false;
    }

    public String toString() {
        String res = uc + ";" + data + "\n";

        for (Aluno a : notas.keySet()) {
            res += "  " + a + ";" + notas.get(a) + "\n";
        }
        return res;
    }

}
