package aulas_praticas.aula11_01;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public interface SortStrategy {

    public List<Telemovel> sort(List<Telemovel> listaTelemoveis, Comparator<Telemovel> comparator);
}
