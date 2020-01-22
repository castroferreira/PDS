package aulas_praticas.aula11_01;

import java.util.Comparator;
import java.util.List;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class SortInsert implements SortStrategy {

    @Override
    public List<Telemovel> sort(List<Telemovel> listaTelemoveis, Comparator<Telemovel> comparator) {
        for (int i = 1; i < listaTelemoveis.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (comparator.compare(listaTelemoveis.get(j), listaTelemoveis.get(j - 1)) < 0) {
                    Telemovel tmp = listaTelemoveis.get(j);
                    listaTelemoveis.set(j, listaTelemoveis.get(j - 1));
                }
            }
        }
        return listaTelemoveis;
    }
}
