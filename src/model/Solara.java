package model;

import avto.Cabriolet;
import detail.Electrician;
import detail.Engine;
import detail.GasTank;
import detail.Headlights;
import detail.Transmission;
import detail.Wheel;
import exceptions.StartCarException;
import factory.Country;

public class Solara extends Cabriolet {
    private static final String NAME_SOLARA = "SOLARA";
    private final boolean isMiniFridge = true;

    public Solara(String color, int maxSpeed, Transmission typeTransmission, boolean isMove, Wheel[] wheel,
                  GasTank gasTank, Engine engine, Electrician electrician, Headlights headlights, Country country) {
        super(color, maxSpeed, typeTransmission, isMove, wheel, gasTank, engine, electrician, headlights, country);
    }

    @Override
    public boolean isRun(Wheel[] wheels, GasTank gasTank, Electrician electrician, Engine engine) throws StartCarException {
        return super.isRun(wheels, gasTank, electrician, engine);
    }

    @Override
    public boolean isStop() {
        return super.isStop();
    }

    @Override
    public boolean isLight() {
        return super.isLight();
    }

    public void doCoolDrink() {
        System.out.println("Напиток охлажден");
    }

    public String getName() {
        return Solara.NAME_SOLARA;
    }

}
