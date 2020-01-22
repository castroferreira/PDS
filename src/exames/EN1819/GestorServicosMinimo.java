package exames.EN1819;

import java.util.*;

/**
 *
 * @author andreia
 */
public class GestorServicosMinimo extends GestorServicosStandard{

    public GestorServicosMinimo(GestorServicos gest1) {
        
        Iterator<String> it = gest1.iterator();
        
        while(it.hasNext()){
            String next = it.next();
            super.registaServico(next, gest1.getServico(next));
        }
    }

    @Override
    public Servico eliminaServico(String ref) {
        return new NullServico();
    }

    @Override
    public boolean registaServico(String ref, Servico servico) {
        return existeServico(ref);
    }
    
    
}