package aulas_praticas.aula11_01;

import java.util.Comparator;
import java.util.List;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
/**
 *
 * Algoritmo de ordenacao: Ordem de complexidade teorica: O(n²/2)+2*O(n)
 *
 * O algoritmo e ineficiente, alem disso tem uma ordem de comlexidade superior a
 * O(nlog(n)) porque demora algum tempo converter a lista para um array e
 * vice-versa.
 *
 */
public class SortSelect implements SortStrategy {

    @Override
    public List<Telemovel> sort(List<Telemovel> listaTelemoveis, Comparator<Telemovel> comparator) {
        for (int i = 0; i < listaTelemoveis.size(); i++) {
            int index = i;

            for (int j = i + 1; j < listaTelemoveis.size(); j++) {
                if (comparator.compare(listaTelemoveis.get(j), listaTelemoveis.get(index)) < 0) {
                    index = j;
                }
            }

            Telemovel tmp = listaTelemoveis.get(index);
            listaTelemoveis.set(index, listaTelemoveis.get(i));
            listaTelemoveis.set(i, tmp);
        }
        return listaTelemoveis;
    }
}
