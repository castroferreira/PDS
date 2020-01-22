package aulas_praticas.aula11_01;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {
        Revista revista = new Revista("Listas Amarelas");

        List<Telemovel> listaTelemoveis = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            listaTelemoveis.add(Telemovel.buildRandomNumber());
        }

        revista.telemoveisRevista(listaTelemoveis);

        System.out.println(revista.toString());

        System.out.println("\n\nTelemoveis ordenados por preco (Insert Sort):\n");
        System.out.println(revista.OrdenarPreco(new SortInsert()));

        System.out.println("\n\nTelemoveis ordenados por processador (Select Sort):\n");
        System.out.println(revista.OrdenarProcessador(new SortSelect()));

        System.out.println("\n\nTelemoveis ordenados por memoria (Bubble Sort):\n");
        System.out.println(revista.OrdenarMemoria(new SortBubble()));
    }
}
