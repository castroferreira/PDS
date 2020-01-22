package aulas_praticas.aula02_T2_01;

public class Main {

    public static void main(String[] args) {

        WordSolver ws;
        try {
            ws = new WordSolver("/home/andreia/Dropbox/PDS/aula01/puzzle.txt");
            ws.solve();
            for (Solution sol : ws.getSolucoes()) {
                System.out.println(sol.toString());
            }
        } catch (Exception e) {
            System.out.println("Erro na abertura do ficheiro");
            //e.printStackTrace();
        }
    }
}