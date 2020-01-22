package exames.EN1718;

public interface ImovelManager extends Iterable<String> {

    public boolean existeImovel(String ref);

    public boolean addImovel(String ref, Imovel imo);

    public Imovel retiraImovel(String ref);

    public void addImovel(String ref, SetImo imo);

    public void addImovel(String ref, String desc);
    
    public Imovel getImovel(String ref);
}