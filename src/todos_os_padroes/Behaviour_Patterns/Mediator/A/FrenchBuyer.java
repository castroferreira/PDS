package todos_os_padroes.Behaviour_Patterns.Mediator.A;

/**
 * Subclasse de Buyer. No construtor definimos o tipo de moeda como "euro".
 * Registamos também o FrenchBuyer com o mediator para que o mediator tenha
 * conhecimento de FrenchBuyer
 */
class FrenchBuyer extends Buyer {

    public FrenchBuyer(Mediator mediator) {
        super(mediator, "Euro");
        this.mediator.registerFrenchBuyer(this);
    }
}
