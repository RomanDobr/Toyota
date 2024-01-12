package avto;

import detail.Electrician;
import detail.Engine;
import detail.GasTank;
import detail.Headlights;
import detail.Transmission;
import detail.Wheel;
import detail.Workable;
import factory.Country;

public abstract class Car implements Workable {
    private Country country;
    private String color;
    private int maxSpeed;
    private Transmission typeTransmission;
    private boolean isMove;
    private Wheel[] wheel;
    private GasTank gasTank;
    private Engine engine;
    private Electrician electrician;
    private Headlights headlights;

    public Car(String color, int maxSpeed, Transmission typeTransmission, boolean isMove, Wheel[] wheel,
               GasTank gasTank, Engine engine, Electrician electrician, Headlights headlights, Country country) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.typeTransmission = typeTransmission;
        this.isMove = isMove;
        this.wheel = wheel;
        this.gasTank = gasTank;
        this.engine = engine;
        this.electrician = electrician;
        this.headlights = headlights;
        this.country = country;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected int getMaxSpeed() {
        return maxSpeed;
    }

    protected void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected Transmission getTypeTransmission() {
        return typeTransmission;
    }

    protected void setTypeTransmission(Transmission typeTransmission) {
        this.typeTransmission = typeTransmission;
    }

    protected boolean isMove() {
        return isMove;
    }

    protected void setMove(boolean move) {
        isMove = move;
    }

    public void setWheel(Wheel[] wheel) {
        this.wheel = wheel;
    }

    public void setGasTank(GasTank gasTank) {
        this.gasTank = gasTank;
    }

    public Wheel[] getWheel() {
        return wheel;
    }

    public GasTank getGasTank() {
        return gasTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public Electrician getElectrician() {
        return electrician;
    }

    public Headlights getHeadlights() {
        return headlights;
    }

}
