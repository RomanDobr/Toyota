package factory;

import detail.*;
public class Factory {
    private Country country;

    public Factory(Country country) {
        this.country = country;
    }

    protected Wheel[] createWheel(int diametr) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel(false, diametr, (diametr == 20 ? true : false));
        }
        return wheels;
    }

    protected GasTank createGasTank() {
        return new GasTank(0);
    }

    protected Engine createEngine() {
        return new Engine(true);
    }

    protected Electrician createElectrician() {
        return new Electrician(true);
    }

    protected Headlights createHeadlights() {
        return new Headlights(true);
    }

    public Country getCountry() {
        return country;
    }

}
