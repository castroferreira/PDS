package exames.ER1718;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Iterator;

// Notas:
// Não altere o código apresentado na alinea 1
// Deve completar o código das alineas 2 e 3
// Pode comentar código para garantir que vai sendo executando parcialmente
public class PDS18REC {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream fl = new PrintStream(new File("pds18rec.txt"));
        test(System.out); // executa e escreve na consola
        fl.println(System.getProperty("user.dir"));
        test(fl); // executa e escreve no ficheiro
        fl.close();
    }

    private static void test(PrintStream out) {
        alinea1(out);
        alinea2(out);
        alinea3(out);
    }

    private static void alinea1(PrintStream out) {
        out.println("\nAlínea 1) ----------------------------------\n");
        RentACar rac = new RentACar();
        Viatura[] cars = {
            new Eletrico("11-ZB-11", "Tesla, Branco escuro platinado, 2018", "K"),
            new Ligeiro("11-ZA-12", "Ford, Camaro, vermelho, 2017", "X"),
            new Mota("11-ZC-13", "Fiat, 500, branco, 2018", "A"),
            new Eletrico("11-ZA-88", "Fiat, 500, branco, 2018", "A"),
            new Eletrico("11-ZC-34", "BMW i3, 2017", "Z")};
        for (Viatura item : cars) {
            rac.add(item);
        }
        out.println("--- Todas as Viaturas :");
        for (Viatura item : rac)
        	out.println(item);
        Iterator<Viatura> iterator = rac.iterator();
        while (iterator.hasNext()) {
            out.println(iterator.next());
        }

        Cliente u1 = new Cliente("117", "Pedro Pereira");
        Cliente u2 = new Cliente("708", "Isabel Vicente");
        Cliente u3 = new Cliente("426", "Cristina Machado");
        rac.aluga("11-ZB-11", u1);
        rac.aluga(cars[2], u2);
        rac.aluga("11-ZC-34", u3);
        out.println("--- Viaturas alugadas :\n" + rac.allAlugados());
        rac.devolve(cars[0]);
        rac.devolve("11-ZC-34");
        out.println("--- Viaturas alugadas :\n" + rac.allAlugados());
    }

    private static void alinea2(PrintStream out) {
        out.println("\nAlínea 2 (exemplo de output) ----------------------------------\n");
        RentACar myLib = new RentACar();
        // Completar
        //
        Viatura[] cars = {
            new Eletrico("11-ZB-11", "Tesla, Branco escuro platinado, 2018", "K"),
            new Ligeiro("11-ZA-12", "Ford, Camaro, vermelho, 2017", "X"),
            new Mota("11-ZC-13", "Fiat, 500, branco, 2018", "A"),
            new Eletrico("11-ZA-88", "Fiat, 500, branco, 2018", "A"),
            new Eletrico("11-ZC-34", "BMW i3, 2017", "Z")};

        out.println("--- Total de Viaturas :\n" + myLib.allViaturas());

        for (Viatura item : cars) {
            myLib.add(item);
        }
        out.println("--- Todas as Viaturas :");
        for (Viatura item : myLib)
        	out.println(item);
        Iterator<Viatura> iterator = myLib.iterator();
        while (iterator.hasNext()) {
            out.println(iterator.next());
        }
    }

    private static void alinea3(PrintStream out) {
        out.println("\nAlínea 3) ----------------------------------\n");
        // Completar
        RentACar rent = new RentACar();
    }
}
