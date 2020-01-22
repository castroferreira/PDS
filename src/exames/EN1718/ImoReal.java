package exames.EN1718;

import java.util.*;

/**
 *
 * @author andreia
 */
public class ImoReal implements ImovelManager {

    private Map<String, Imovel> map = new HashMap<String, Imovel>();

    public ImoReal() {
    }

    @Override
    public boolean existeImovel(String ref) {
        return map.containsKey(ref);
    }

    @Override
    public boolean addImovel(String ref, Imovel imo) {
        map.put(ref, imo);
        return false;
    }

    @Override
    public Imovel retiraImovel(String ref) {
        if (map.containsKey(ref)) {
            return map.remove(ref);
        }
        return new NullImo();
    }

    @Override
    public void addImovel(String ref, SetImo imo) {
        map.put(ref, (Imovel) imo);
    }

    @Override
    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public void addImovel(String ref, String desc) {
    }

    @Override
    public Imovel getImovel(String ref) {
        if (map.containsKey(ref)) {
            return map.get(ref);
        }
        return null;
    }
}