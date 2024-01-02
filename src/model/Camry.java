package model;

import avto.PassengerCar;
import detail.*;
import exceptions.StartCarException;
import factory.Country;

public class Camry extends PassengerCar {
    private static final String NAME_CAMRY = "CAMRY";
    private final boolean isUsb = true;

    public Camry(String color, int maxSpeed, Transmission typeTransmission, boolean isMove, Wheel[] wheel,
                 GasTank gasTank, Engine engine, Electrician electrician, Headlights headlights, Country country) {
        super(color, maxSpeed, typeTransmission, isMove, wheel, gasTank, engine, electrician, headlights, country);
    }

    @Override
    public boolean isRun(Wheel[] wheels, GasTank gasTank,
                         Electrician electrician, Engine engine) throws StartCarException {
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

    public boolean isUsb() {
        return isUsb;
    }

    public boolean isMusic() {
        return true;
    }

    public String getName() {
        return Camry.NAME_CAMRY;
    }

}
