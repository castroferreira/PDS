package todos_os_padroes.Behaviour_Patterns.Mediator.A;

/**
 *
 * Obtem uma referência para o mediator e regista o mediador como
 * DollarConverter. Esta classe possui métodos para converter valores em euros,
 * coroas e dolares.
 */
public class DollarConverter {

    Mediator mediator;

    public static final float dollar = 1.0f;
    public static final float euro = 0.7f;
    public static final float coroa = 8.0f;

    public DollarConverter(Mediator mediator) {
        this.mediator = mediator;
        mediator.registerDollarConverter(this);
    }

    private float convertEurosToDollares(float euros) {
        float dolares = euros * (dollar / euro);
        System.out.println(euros + " euros= " + dolares + "dolares");
        return dolares;

    }

    private float convertCoroaToDollares(float coroas) {
        float dolares = coroas * (dollar / coroa);
        System.out.println(coroas + " coroa= " + dolares + "dolares");
        return dolares;

    }

    public float convertToDolares(float montante, String typeMoney) {
        if ("coroa".equalsIgnoreCase(typeMoney)) {
            return convertCoroaToDollares(montante);
        } else {
            return convertEurosToDollares(montante);
        }
    }
}
