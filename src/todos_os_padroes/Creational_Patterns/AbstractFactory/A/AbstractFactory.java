package todos_os_padroes.Creational_Patterns.AbstractFactory.A;

/**
 *
 * Classe que vai gerar as fábricas mamiferos ou repteis consoante o tipe de
 * espécie que recebe
 *
 */
public class AbstractFactory {

    public SpeciesFactories getSpeciesFactories(String type) {
        if (type.equalsIgnoreCase("mammal")) {
            return new MamiFactory();
        } else {
            return new ReptileFactory();
        }
    }
}
