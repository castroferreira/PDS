package aulas_praticas.aula11_03;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] op;
            int nLivros;

            List<Livro> livros = new ArrayList<>();

            livros.add(new Livro("Java Anti-Stress", "1-1", "Omodionah", 2018));
            livros.add(new Livro("A Guerra dos Padrões", "1-1", "Jorge Omel", 2018));
            livros.add(new Livro("A Procura da Luz", "1-1", "Khumatkli", 2018));

            do {
                System.out.println("*** Biblioteca ***");

                int i = 0;
                for (Livro x : livros) {
                    System.out.println(++i + "   " + x);
                }

                System.out.println(">> <Livro>, <operacao: (1)regista; (2)requisita; (3)devolve; (4) reserva; (5) cancela");
                System.out.print("\n>> ");

                op = sc.nextLine().split(",");
                nLivros = Integer.parseInt(op[0]) - 1;

                if (nLivros < 0 || nLivros >= livros.size()) {
                    System.out.println("Fecho do programa\n");
                    break;
                }

                try {
                    switch (Integer.parseInt(op[1])) {
                        case 1:
                            livros.get(nLivros).regista();
                            break;
                        case 2:
                            livros.get(nLivros).requisita();
                            break;
                        case 3:
                            livros.get(nLivros).devolve();
                            break;
                        case 4:
                            livros.get(nLivros).reserva();
                            break;
                        case 5:
                            livros.get(nLivros).cancela();
                            break;
                        default:
                            break;
                    }
                } catch (UnsupportedOperationException e) {
                    System.out.println(e.getMessage() + "\n");
                }

            } while (true);
        }
    }
}
