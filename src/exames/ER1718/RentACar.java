package exames.ER1718;

import java.util.*;

/**
 *
 * @author andreia
 */
class RentACar implements Iterable<Viatura> {

    private List<Viatura> list_viaturas;
    private Map<String, Cliente> map_alugados = new HashMap<>();

    public RentACar() {
        list_viaturas = new ArrayList<>();
    }

    public boolean add(Viatura v) {
        list_viaturas.add(v);
        System.out.println(v.toString());
        return true;
    }

    public boolean aluga(String code, Cliente c) {
        map_alugados.put(code, c);
        return true;
    }

    public boolean aluga(Viatura v, Cliente c) {
        map_alugados.put(v.getMatricula(), c);
        return true;
    }

    public String allAlugados() {
        int alugado = 0;

        for (Map.Entry<String, Cliente> entry : map_alugados.entrySet()) {
            alugado++;
            String key = entry.getKey();
            Cliente c = entry.getValue();
            System.out.println(key + " alugado a " + c.toString());
        }

        return "Total: " + alugado;
    }

    public boolean devolve(String code) {
        for (Map.Entry<String, Cliente> devolve : map_alugados.entrySet()) {
            if (devolve.getKey().equalsIgnoreCase(code)) {
                map_alugados.remove(code);
                return true;
            }
        }
        return false;
    }

    public boolean devolve(Viatura viatura) {
        for (Viatura v : list_viaturas) {
            if (v.equals(viatura)) {
                list_viaturas.remove(viatura);
                return true;
            }
        }
        return false;
    }

    public Viatura remove(String code) {
        for (Viatura v : list_viaturas) {
            if (v.getMatricula().equalsIgnoreCase(code)) {
                list_viaturas.remove(code);
            }
        }
        return (Viatura) list_viaturas;
    }

    public Viatura remove(Viatura viatura) {
        for (Viatura v : list_viaturas) {
            if (v.equals(viatura)) {
                list_viaturas.remove(viatura);
            }
        }
        return (Viatura) list_viaturas;
    }

    public Iterator<Viatura> iterator() {
        return new ViaturaIterator();
    }

    public String allViaturas() {

        int viatura = 0;

/*        for (Map.Entry<String, Cliente> entry : map_alugados.entrySet()) {
            viatura++;
            String key = entry.getKey();
            Cliente c = entry.getValue();
            System.out.println(key + " alugado a " + c.toString());
        }
*/
        return "Total: " + viatura;
    }

    class ViaturaIterator implements Iterator<Viatura> {

        int i = 0;

        @Override
        public boolean hasNext() {
            if (i >= list_viaturas.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Viatura next() {
            return list_viaturas.get(i++);
        }

        @Override
        public void remove() {
            list_viaturas.remove(--i);
        }
    }
}
