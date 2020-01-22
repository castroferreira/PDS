package aulas_praticas.aula11_01;

import java.util.Comparator;
import java.util.List;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class SortBubble implements SortStrategy {

    @Override
    public List<Telemovel> sort(List<Telemovel> listaTelemoveis, Comparator<Telemovel> comparator) {
        for (int i = 0; i < listaTelemoveis.size() - 1; i++) {
            for (int j = i + 1; j < listaTelemoveis.size(); j++) {
                if (comparator.compare(listaTelemoveis.get(i), listaTelemoveis.get(j)) > 0) {
                    Telemovel tmp = listaTelemoveis.get(i);
                    listaTelemoveis.set(i, listaTelemoveis.get(j));
                    listaTelemoveis.set(j, tmp);
                }
            }
        }
        return listaTelemoveis;
    }
}
