package avto;

import detail.*;
import exceptions.StartCarException;
import factory.Country;

public class CargoVan extends Car {
    private int capacity;
    public CargoVan(String color, int maxSpeed, Transmission typeTransmission, boolean isMove, Wheel[] wheel,
                    GasTank gasTank, Engine engine, Electrician electrician, Headlights headlights, Country country) {
        super(color, maxSpeed, typeTransmission, isMove, wheel, gasTank, engine, electrician, headlights, country);
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
}
