package aulas_praticas.aula11_01;

import java.util.*;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Revista {

    private List<Telemovel> listaTelemoveis;
    private String nome;

    public Revista(String nomeRevista) {
        this.nome = nomeRevista;
        listaTelemoveis = new ArrayList<>();
    }

    public boolean addTelemovel(Telemovel t) {
        return listaTelemoveis.add(t);
    }

    public void telemoveisRevista(List<Telemovel> listaTelemoveis) {
        this.listaTelemoveis = listaTelemoveis;
    }

    public List<Telemovel> OrdenarPreco(SortStrategy strategy) {
        return strategy.sort(listaTelemoveis, new Comparator<Telemovel>() {
            @Override
            public int compare(Telemovel o1, Telemovel o2) {
                return (int) (o1.getPreco() - o2.getPreco());
            }
        });
    }

    public List<Telemovel> OrdenarMemoria(SortStrategy strategy) {
        return strategy.sort(listaTelemoveis, new Comparator<Telemovel>() {
            @Override
            public int compare(Telemovel o1, Telemovel o2) {
                return (int) (o1.getMemoria() - o2.getMemoria());
            }
        });
    }

    public List<Telemovel> OrdenarCamera(SortStrategy strategy) {
        return strategy.sort(listaTelemoveis, new Comparator<Telemovel>() {
            @Override
            public int compare(Telemovel o1, Telemovel o2) {
                return (int) (o1.getCamera() - o2.getCamera());
            }
        });
    }

    public List<Telemovel> OrdenarProcessador(SortStrategy strategy) {
        return strategy.sort(listaTelemoveis, new Comparator<Telemovel>() {
            @Override
            public int compare(Telemovel o1, Telemovel o2) {
                return (int) (o1.getProcessador() - o2.getProcessador());
            }
        });
    }

    @Override
    public String toString() {
        return "Revista: " + nome + "\nTelemoveis: " + listaTelemoveis + "\n\n";
    }
}
