package exames.EN1819;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GestorServicosStandard implements GestorServicos {

    private Map<String, Servico> map = new HashMap<String, Servico>();

    @Override
    public Iterator<String> iterator() {

        return map.keySet().iterator();
    }

    @Override
    public boolean registaServico(String ref, Servico servico) {
        map.put(ref, servico);
        return false;
    }

    @Override
    public boolean existeServico(String ref) {
        return map.containsKey(ref);
    }

    @Override
    public Servico eliminaServico(String ref) {
        if (map.containsKey(ref)) {
            return map.remove(ref);
        }
        return new NullServico();
    }

    @Override
    public Servico getServico(String ref) {
        if (map.containsKey(ref)) {
            return map.get(ref);
        }
        return null;
    }
}