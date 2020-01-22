package todos_os_padroes.Behaviour_Patterns.Memento.A;

/*
Cria-se um careTaker e em seguida um object DietInfo.
o estado deste objeto é alterado e exibido. 
A qualquer momento o caretaker guarda o estado do objeto DietInfo. Depois é alterado e exibido.
o caretaker restaura o estado desse objeto.
 */
public class Main {

    public static void main(String[] args) {
        DietInfoCareTaker dietInfoCareTaker = new DietInfoCareTaker();
        DietInfo dietInfo = new DietInfo("Beatriz", 1, 67);

        System.out.println(dietInfo);
        dietInfo.setDiaDietaPeso(2, 66);

        System.out.println(dietInfo);
        System.out.println("Saving state");
        dietInfoCareTaker.saveState(dietInfo);
        dietInfo.setDiaDietaPeso(3, 65);

        System.out.println(dietInfo);
        dietInfo.setDiaDietaPeso(4, 64);

        System.out.println(dietInfo);
        System.out.println("Restoring saved state.");

        dietInfoCareTaker.restoreState(dietInfo);
        System.out.println(dietInfo);
    }
}
