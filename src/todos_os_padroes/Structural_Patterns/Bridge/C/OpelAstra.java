package todos_os_padroes.Structural_Patterns.Bridge.C;

public class OpelAstra extends Veiculo {

    public OpelAstra(int peso) {
        setPeso(peso);
    }

    @Override
    public void setPrintCondutor(String condutor) {
        System.out.println("O " + condutor + " conduz o carro: " + this.getClass().getSimpleName());
    }
}
