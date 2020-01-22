package aulas_praticas.aula04_T1_02;

public interface Metodos {

    public abstract void load(String filename);

    public abstract boolean validateName(String name);

    public abstract boolean addMembro(int x1, int x2, String name);

    public abstract void removeMembro(String name);

    public abstract void map(Rua r);
}
