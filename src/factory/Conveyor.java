package factory;

import detail.*;
import exceptions.CarNotFaundException;
import exceptions.CountyFactoryNotEqualException;
import model.Camry;
import model.Dyna;
import model.Hiance;
import model.Solara;

import static detail.Transmission.*;

public class Conveyor {
    private Country country;
    private PriceCar priceCar;
    private Factory factory;
    private static int countCamry;
    public Conveyor(Country country, Factory factory) {
        this.country = country;
        this.factory = factory;
    }


    private Camry createCamry(String color, PriceCar priceCamry) throws CountyFactoryNotEqualException {
        checkCountry(factory);
        Wheel[] wheelsCamry = factory.createWheel(17);
        GasTank gasTankCamry = factory.createGasTank();
        Engine engineCamry = factory.createEngine();
        Electrician electricianCamry = factory.createElectrician();
        Headlights headlightsCamry = factory.createHeadlights();
        gasTankCamry.setCountFuel(20);
        headlightsCamry.setFunctional(false);
        Camry camry = new Camry(color, 220, AKPP,
                true, wheelsCamry,
                gasTankCamry, engineCamry,
                electricianCamry, headlightsCamry, this.country);
        return camry;
    }

    private Solara createSolara(String color, PriceCar priceSolara) throws CountyFactoryNotEqualException {
        checkCountry(factory);
        Wheel[] wheelsSolara = factory.createWheel(16);
        GasTank gasTankSolara = factory.createGasTank();
        Engine engineSolara = factory.createEngine();
        Electrician electricianSolara = factory.createElectrician();
        Headlights headlightsSolara = factory.createHeadlights();
        gasTankSolara.setCountFuel(20);
        headlightsSolara.setFunctional(false);
        Solara solara = new Solara(color, 200, AKPP,
                true, wheelsSolara,
                gasTankSolara, engineSolara,
                electricianSolara, headlightsSolara, this.country);
        return solara;
    }

    private Dyna createDyna(String color, PriceCar priceDyna) throws CountyFactoryNotEqualException {
        checkCountry(factory);
        Wheel[] wheelsDyna = factory.createWheel(20);
        GasTank gasTankDyna = factory.createGasTank();
        Engine engineDyna = factory.createEngine();
        Electrician electricianDyna = factory.createElectrician();
        Headlights headlightsDyna = factory.createHeadlights();
        gasTankDyna.setCountFuel(20);
        Dyna dyna = new Dyna(color, 180, MECHANICS,
                true, wheelsDyna,
                gasTankDyna, engineDyna,
                electricianDyna, headlightsDyna, this.country);
        return dyna;
    }

    private Hiance createHiance(String color, PriceCar priceHiance) throws CountyFactoryNotEqualException {
        checkCountry(factory);
        Wheel[] wheelsHiance = factory.createWheel(20);
        GasTank gasTankHiance = factory.createGasTank();
        Engine engineHiance = factory.createEngine();
        Electrician electricianHiance = factory.createElectrician();
        Headlights headlightsHiance = factory.createHeadlights();
        gasTankHiance.setCountFuel(20);
        Hiance hiance = new Hiance(color, 160, MECHANICS,
                true, wheelsHiance,
                gasTankHiance, engineHiance,
                electricianHiance, headlightsHiance, this.country);
        return hiance;
    }

    public Object createCar(String color, int sum) throws CountyFactoryNotEqualException, CarNotFaundException {
        if (sum == 10_000) {
            PriceCar priceCamry = new PriceCar(sum, 0);
            Camry camry = createCamry(color, priceCamry);
            return camry;
        } else if (sum == 12_000) {
            PriceCar priceSolara = new PriceCar(sum, 0);
            Solara solara = createSolara(color, priceSolara);
            return solara;
        } else if (sum == 15_000) {
            PriceCar priceHiance = new PriceCar(sum, 0);
            Hiance hiance = createHiance(color, priceHiance);
            return hiance;
        } else if (sum == 22_000) {
            PriceCar priceDyna = new PriceCar(sum, 0);
            Dyna dyna = createDyna(color, priceDyna);
            return dyna;
        }
        throw new CarNotFaundException("Такой машины не существует");
    }

    public Country getCountry() {
        return country;
    }

    private boolean checkCountry(Factory factory) throws CountyFactoryNotEqualException {
        if (this.getCountry().equals(factory.getCountry())){
            return true;
        }
        String s = "Ошибка: страна " + this.getCountry() + " c конвейером, " +
                   "не совпадает со страной где фабрика " + factory.getCountry();
        throw new CountyFactoryNotEqualException(s);
    }
}
