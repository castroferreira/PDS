package aulas_praticas.aula05_03;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {

        Person person1 = new Person.PersonBuilder("Andreia", "Ferreira", "Rua da Estrada", "Espinho", true)
                .middleName("Castro")
                .state("Aveiro")
                .isEmployed(false)
                .isHomewOwner(false)
                .build();

        System.out.println(person1.toString());

        System.out.println();
        System.out.println();

        Person person2 = new Person.PersonBuilder("Rui", "Serrano", "Av Lourenco Peixinho", "Vera Cruz", false)
                .middleName("Miguel")
                .state("Aveiro")
                .isEmployed(true)
                .isHomewOwner(true)
                .build();

        System.out.println(person2.toString());

        /**
         *
         * ("Ferreira", "Andreia", "Castro", "Hi!", "65791", "Rua da Estrada",
         * "Espinho", "Aveiro", true, false, false) ("Serrano", "Rui", "Miguel",
         * "Hey!", "12345", "Av Lourenco Peixinho", "Vera Cruz", "Aveiro",
         * false, true, false)
         *
         * exemplo slides String data = new StringBuilder("Exemplo de builder_")
         * .append(1) .append(true) .append("_para_fechar") .toString();
         *
         * System.out.println(data);
         */
    }
}
