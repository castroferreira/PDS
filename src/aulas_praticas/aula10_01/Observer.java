package aulas_praticas.aula10_01;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
abstract class Observer {

    protected List<Subject> leilaoSubject = new ArrayList<>();

    public abstract void update(Subject produtoUpdate);
}
