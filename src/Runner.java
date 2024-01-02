
import exceptions.CarNotFaundException;
import exceptions.CountyFactoryNotEqualException;
import factory.Conveyor;
import factory.Factory;
import factory.Stock;
import model.Camry;
import model.Dyna;
import model.Hiance;
import model.Solara;
import shop.Cashier;
import shop.Client;
import shop.Manager;

import java.io.IOException;

import static factory.Country.JAPAN;

public class Runner {
    public static void main(String[] args) {
        Factory factory = new Factory(JAPAN);
        Conveyor conveyor = new Conveyor(JAPAN, factory);
        Stock stock = new Stock(JAPAN);
        Client client1 = new Client("Роман", 10_000,0);
        Client client2 = new Client("Дима", 12_000,0);
        Client client3 = new Client("Стас", 15_000,0);
        Client client4 = new Client("Марат", 22_000,0);
        Client client5 = new Client("Юрий", 11_000,0);
        Client client6 = new Client("Дамир", 13_000,0);
        Client client7 = new Client("Сергей", 8_000,0);
        Client client8 = new Client("Павел", 30_000,0);
        Cashier cashier = new Cashier();
        Manager manager = new Manager("Коля");

        try {
            stock.setCamryStock((Camry) conveyor.createCar("Black", 10_000));
            stock.setSolaraStock((Solara) conveyor.createCar("White", 12_000));
            stock.setHianceStock((Hiance) conveyor.createCar("Black", 15_000));
            stock.setDynaStock((Dyna) conveyor.createCar("Black", 22_000));
            for (Client client : Client.getClients()) {
                manager.sellTheCar(client, stock, cashier, conveyor);
            }
            manager.getReportsToFile(manager.getReports());
        } catch (CountyFactoryNotEqualException | CarNotFaundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
