package model;

import avto.CargoVan;
import detail.*;
import exceptions.StartCarException;
import factory.Country;

public class Hiance extends CargoVan {
    private static final String NAME_HIANCE = "HIANCE";

    private final boolean spareWheel = true;

    public Hiance(String color, int maxSpeed, Transmission typeTransmission, boolean isMove, Wheel[] wheel,
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

    public String getName() {
        return Hiance.NAME_HIANCE;
    }
}
