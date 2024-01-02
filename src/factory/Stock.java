package factory;

import exceptions.CarNotFaundException;
import model.Camry;
import model.Dyna;
import model.Hiance;
import model.Solara;

public class Stock {
    private Country country;
    private int countFreeSpaceForCar = 1_000;
    private int countCurrentCar = 0;
    private Camry[] camrys = new Camry[0];
    private Solara[] solaras = new Solara[0];
    private Dyna[] dynas = new Dyna[0];
    private Hiance[] hiances = new Hiance[0];
    private int countCurrentCamry = 0;
    private int countCurrentSolara = 0;
    private int countCurrentDyna = 0;
    private int countCurrentHiance = 0;

    public Stock(Country country) {
        this.country = country;
    }

    public void setCamryStock(Camry camry) {
        countCurrentCamry++;
        countCurrentCar++;
        countFreeSpaceForCar--;
        Camry[] copyCamry = new Camry[countCurrentCamry];
        if (camrys.length != countCurrentCamry) {
            for (int i = 0; i < camrys.length; i++) {
                copyCamry[i] = camrys[i];
            }
        }
        camrys = new Camry[copyCamry.length];
        for (int i = 0; i < camrys.length; i++) {
            camrys[i] =  copyCamry[i];
        }
        camrys[countCurrentCamry-1] = camry;
        System.out.println("машина " + camry.getName() + " создана №" + countCurrentCamry);
        System.out.println("------------------------------------------------------------------");
    }

    public Camry getCamryStock() throws CarNotFaundException {
        if (camrys.length == 0) {
            throw new CarNotFaundException("Отсутствует модель Camry на складе");
        }
        countCurrentCar--;
        countFreeSpaceForCar++;
        Camry camry = camrys[countCurrentCamry-1];
        System.out.println("машина " + camry.getName() + " забрали №" + countCurrentCamry);
        System.out.println("------------------------------------------------------------------");
        Camry[] copyCamry = new Camry[countCurrentCamry];
        if (camrys.length == countCurrentCamry) {
            for (int i = 0; i < camrys.length; i++) {
                copyCamry[i] = camrys[i];
            }
        }
        camrys = new Camry[copyCamry.length - 1];
        for (int i = 0; i < camrys.length; i++) {
            camrys[i] = copyCamry[i];
        }
        countCurrentCamry--;
        return camry;
    }
    //*******************************************************************************************************
    public void setSolaraStock(Solara solara) {
        countCurrentSolara++;
        countCurrentCar++;
        countFreeSpaceForCar--;
        Solara[] copySolara = new Solara[countCurrentSolara];
        if (solaras.length != countCurrentSolara) {
            for (int i = 0; i < solaras.length; i++) {
                copySolara[i] = solaras[i];
            }
        }
        solaras = new Solara[copySolara.length];
        for (int i = 0; i < solaras.length; i++) {
            solaras[i] = copySolara[i];
        }
        solaras[countCurrentSolara-1] = solara;
        System.out.println("машина " + solara.getName() + " создана №" + countCurrentSolara);
        System.out.println("------------------------------------------------------------------");
    }

    public Solara getSolaraStock() throws CarNotFaundException {
        if (solaras.length == 0) {
            throw new CarNotFaundException("Отсутствует модель Solara на складе");
        }
        countCurrentCar--;
        countFreeSpaceForCar++;
        Solara solara = solaras[countCurrentSolara-1];
        System.out.println("машина " + solara.getName() + " забрали №" + countCurrentSolara);
        System.out.println("------------------------------------------------------------------");
        Solara[] copySolara = new Solara[countCurrentSolara];
        if (solaras.length == countCurrentSolara) {
            for (int i = 0; i < solaras.length; i++) {
                copySolara[i] = solaras[i];
            }
        }
        solaras = new Solara[copySolara.length - 1];
        for (int i = 0; i < solaras.length; i++) {
            solaras[i] = copySolara[i];
        }
        countCurrentSolara--;
        return solara;
    }
    //*******************************************************************************************************
    public void setDynaStock(Dyna dyna) {
        countCurrentDyna++;
        countCurrentCar++;
        countFreeSpaceForCar--;
        Dyna[] copyDyna = new Dyna[countCurrentDyna];
        if (dynas.length != countCurrentDyna) {
            for (int i = 0; i < dynas.length; i++) {
                copyDyna[i] = dynas[i];
            }
        }
        dynas = new Dyna[copyDyna.length];
        for (int i = 0; i < dynas.length; i++) {
            dynas[i] = copyDyna[i];
        }
        dynas[countCurrentDyna-1] = dyna;
        System.out.println("машина " + dyna.getName() + " создана №" + countCurrentDyna);
        System.out.println("------------------------------------------------------------------");
    }

    public Dyna getDynaStock() throws CarNotFaundException {
        if (dynas.length == 0) {
            throw new CarNotFaundException("Отсутствует модель Dyna на складе");
        }
        countCurrentCar--;
        countFreeSpaceForCar++;
        Dyna dyna = dynas[countCurrentDyna-1];
        System.out.println("машина " + dyna.getName() + " забрали №" + countCurrentDyna);
        System.out.println("------------------------------------------------------------------");
        Dyna[] copyDyna = new Dyna[countCurrentDyna];
        if (dynas.length == countCurrentDyna) {
            for (int i = 0; i < dynas.length; i++) {
                copyDyna[i] = dynas[i];
            }
        }
        dynas = new Dyna[copyDyna.length - 1];
        for (int i = 0; i < dynas.length; i++) {
            dynas[i] = copyDyna[i];
        }
        countCurrentDyna--;
        return dyna;
    }
    //*******************************************************************************************************
    public void setHianceStock(Hiance hiance) {
        countCurrentHiance++;
        countCurrentCar++;
        countFreeSpaceForCar--;
        Hiance[] copyHiance = new Hiance[countCurrentHiance];
        if (hiances.length != countCurrentHiance) {
            for (int i = 0; i < hiances.length; i++) {
                copyHiance[i] = hiances[i];
            }
        }
        hiances = new Hiance[copyHiance.length];
        for (int i = 0; i < hiances.length; i++) {
            hiances[i] = copyHiance[i];
        }
        hiances[countCurrentHiance-1] = hiance;
        System.out.println("машина " + hiance.getName() + " создана №" + countCurrentHiance);
        System.out.println("------------------------------------------------------------------");
    }

    public Hiance getHianceStock() throws CarNotFaundException {
        if (hiances.length == 0) {
            throw new CarNotFaundException("Отсутствует модель Hiance на складе");
        }
        countCurrentCar--;
        countFreeSpaceForCar++;
        Hiance hiance = hiances[countCurrentHiance-1];
        System.out.println("машина " + hiance.getName() + " забрали №" + countCurrentHiance);
        System.out.println("------------------------------------------------------------------");
        Hiance[] copyHiance = new Hiance[countCurrentHiance];
        if (hiances.length == countCurrentHiance) {
            for (int i = 0; i < hiances.length; i++) {
                copyHiance[i] = hiances[i];
            }
        }
        hiances = new Hiance[copyHiance.length - 1];
        for (int i = 0; i < hiances.length; i++) {
           hiances[i] = copyHiance[i];
        }
        countCurrentHiance--;
        return hiance;
    }

    public int getCountFreeSpaceForCar() {
        return countFreeSpaceForCar;
    }

    public int getCountCurrentCar() {
        return countCurrentCar;
    }

    public int getCountCurrentCamry() {
        return countCurrentCamry;
    }

    public int getCountCurrentSolara() {
        return countCurrentSolara;
    }

    public int getCountCurrentDyna() {
        return countCurrentDyna;
    }

    public int getCountCurrentHiance() {
        return countCurrentHiance;
    }

    public Camry[] getCamrys() {
        return camrys;
    }

    public Solara[] getSolaras() {
        return solaras;
    }

    public Dyna[] getDynas() {
        return dynas;
    }

    public Hiance[] getHiances() {
        return hiances;
    }
}
