package Exame;

public class TestMe {

    public static void main(String[] args) {

        Pauta pautaPDS = new Pauta(new UnidadeCurricular(40383, "Padroes e desenho de software"), "2017/07/11");

        pautaPDS.adicionarAluno(new Aluno(1000, "Jose Silva"), 10 + (int) (Math.random() * 11));
        pautaPDS.adicionarAluno(new Aluno(9000, "Ana Maria"), 10 + (int) (Math.random() * 11));
        pautaPDS.adicionarAluno(new Aluno(4000, "Carlos Matos"), 10 + (int) (Math.random() * 11));
        System.out.println("1. Listagem das notas de 3 alunos em PDS");
        System.out.println(pautaPDS);

        // escolher formato CSV...
//		ArmazenamentoInterface csv = new ArmazenamentoCSV("pautaPDS.csv");
//		csv.gravarPauta(pautaPDS);
        // ... ou o formato OBJ (serial)
        ArmazenamentoInterface serial = new ArmazenamentoSerial("pautaPDS.obj");
        serial.gravarPauta(pautaPDS);
        Aluno a1 = new Aluno(6000, "Maria Santos");
        pautaPDS.adicionarAluno(a1, 10 + (int) (Math.random() * 11));
        pautaPDS.setNota(a1, 17);
        System.out.println("2. Listagem das notas de 4 alunos em PDS");
        System.out.println(pautaPDS);
        // escolher o formato CSV ou OBJ (serial)
//		System.out.println(csv.lerPauta());
        //System.out.println(serial.lerPauta());
        // Testar o comando undo aqui ...
    }
}
