package todos_os_padroes.Behaviour_Patterns.Mediator.A;

/**
 *
 * Subclasse de Buyer. No construtor definimos o tipo de moeda como "Coroa".
 * Registamos também o SwedishBuyer com o mediator para que o mediator tenha
 * conhecimento de SwedishBuyer
 */
class SwedishBuyer extends Buyer {

    public SwedishBuyer(Mediator mediator) {
        super(mediator, "Coroa");
        this.mediator.registerSwedishBuyer(this);
    }
}
