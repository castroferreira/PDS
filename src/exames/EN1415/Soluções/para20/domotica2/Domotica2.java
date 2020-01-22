package exames.EN1415.Soluções.para20.domotica2;

import exames.EN1415.Soluções.para20.model.*;

public class Domotica2 {

    public static void main(String[] args) {

        BaseStationXL base1 = new BaseStationXL(1, "Hall1");
        BaseStationXL base2 = new BaseStationXL(2, "Hall2");
        BaseStationXL base3 = new BaseStationXL(3, "Hall3");
        BaseStationXL base4 = new BaseStationXL(4, "Hall4");

        Central central1 = new EnglishCentral(1);
        Central central2 = new PortugueseCentral(2);

        //  Central 1 regista-se na base 2
        base2.regist(central1);
        //  Central 2 regista-se na base 2
        base2.regist(central2);
        //  Central 2 regista-se na base 4
        base4.regist(central2);

        //  adicionando sensores a base 1
        base1.connect(new EuroThermo());
        base1.connect(new AmericanThermoAdapter());
        base1.connect(new EnglishPressureAdapter());
        base1.connect(new ScientificThermoAdapter());

        //  adicionando sensores a base 2
        base2.connect(new EuroThermo());
        base2.connect(new AmericanThermoAdapter());
        base2.connect(new EnglishPressureAdapter());
        base2.connect(new ScientificThermoAdapter());

        //  adicionando sensores a base 3
        base3.connect(new EuroThermo());
        base3.connect(new AmericanThermoAdapter());
        base3.connect(new EnglishPressureAdapter());
        base3.connect(new ScientificThermoAdapter());

        //  adicionando sensores a base 4
        base4.connect(new EuroThermo());
        base4.connect(new AmericanThermoAdapter());
        base4.connect(new EnglishPressureAdapter());
        base4.connect(new ScientificThermoAdapter());

    }
}
