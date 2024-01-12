package shop;

import exceptions.CarNotFaundException;
import exceptions.CountyFactoryNotEqualException;
import factory.Conveyor;
import factory.Stock;
import java.io.FileWriter;
import java.io.IOException;
import model.Camry;
import model.Dyna;
import model.Hiance;
import model.Solara;


public class Manager {

    private String name;
    private Report report;
    private String[] reports = new String[0];

    public Manager(String name) {
        this.name = name;
    }

    public void sellTheCar(Client client, Stock stock, Cashier cashier, Conveyor conveyor)
            throws CarNotFaundException, CountyFactoryNotEqualException {
        int moneyClient = client.getMoneyClient().getDollar() + client.getMoneyClient().getCent();
        if ((moneyClient >= PriceCars.PRICE_CAMRY.getPrice()) && (moneyClient < PriceCars.PRICE_SOLARA.getPrice())) {
            if (stock.getCountCurrentCamry() > 0) {
                Camry camry = stock.getCamryStock();
                client.goCarWithClient(camry);
                cashier.setIncomSumma(camry.getName());
                report = new Report(this.name, camry.getName(), Integer.toString(PriceCars.PRICE_CAMRY.getPrice()),
                        Integer.toString(CostPrice.COST_PRICE_CAMRY.getPrice()));
                setReports(report);
                report = null;
            } else {
                stock.setCamryStock((Camry) conveyor.createCar("Black", 10_000));
                Camry camry = stock.getCamryStock();
                client.goCarWithClient(camry);
                cashier.setIncomSumma(camry.getName());
                report = new Report(this.name, camry.getName(), Integer.toString(PriceCars.PRICE_CAMRY.getPrice()),
                        Integer.toString(CostPrice.COST_PRICE_CAMRY.getPrice()));
                setReports(report);
                report = null;
            }
        } else if ((moneyClient >= PriceCars.PRICE_SOLARA.getPrice()) && (moneyClient < PriceCars.PRICE_HIANCE.getPrice())) {
            if (stock.getCountCurrentSolara() > 0) {
                Solara solara = stock.getSolaraStock();
                client.goCarWithClient(solara);
                cashier.setIncomSumma(solara.getName());
                report = new Report(this.name, solara.getName(), Integer.toString(PriceCars.PRICE_SOLARA.getPrice()),
                        Integer.toString(CostPrice.COST_PRICE_SOLARA.getPrice()));
                setReports(report);
                report = null;
            } else {
                stock.setSolaraStock((Solara) conveyor.createCar("White", 12_000));
                Solara solara = stock.getSolaraStock();
                cashier.setIncomSumma(solara.getName());
                report = new Report(this.name, solara.getName(), Integer.toString(PriceCars.PRICE_SOLARA.getPrice()),
                        Integer.toString(CostPrice.COST_PRICE_SOLARA.getPrice()));
                setReports(report);
                report = null;
            }
        } else if ((moneyClient >= PriceCars.PRICE_HIANCE.getPrice()) && (moneyClient < PriceCars.PRICE_DYNA.getPrice())) {
            if (stock.getCountCurrentHiance() > 0) {
                Hiance hiance = stock.getHianceStock();
                client.goCarWithClient(hiance);
                cashier.setIncomSumma(hiance.getName());
                report = new Report(this.name, hiance.getName(), Integer.toString(PriceCars.PRICE_HIANCE.getPrice()),
                        Integer.toString(CostPrice.COST_PRICE_HIANCE.getPrice()));
                setReports(report);
                report = null;
            } else {
                stock.setHianceStock((Hiance) conveyor.createCar("Black", 15_000));
                Hiance hiance = stock.getHianceStock();
                client.goCarWithClient(hiance);
                cashier.setIncomSumma(hiance.getName());
                report = new Report(this.name, hiance.getName(), Integer.toString(PriceCars.PRICE_HIANCE.getPrice()),
                        Integer.toString(CostPrice.COST_PRICE_HIANCE.getPrice()));
                setReports(report);
                report = null;
            }
        } else if ((moneyClient >= PriceCars.PRICE_DYNA.getPrice())) {
            if (stock.getCountCurrentDyna() > 0) {
                Dyna dyna = stock.getDynaStock();
                client.goCarWithClient(dyna);
                cashier.setIncomSumma(dyna.getName());
                report = new Report(this.name, dyna.getName(), Integer.toString(PriceCars.PRICE_DYNA.getPrice()),
                        Integer.toString(CostPrice.COST_PRICE_DYNA.getPrice()));
                setReports(report);
                report = null;
            } else {
                stock.setDynaStock((Dyna) conveyor.createCar("Black", 22_000));
                Dyna dyna = stock.getDynaStock();
                client.goCarWithClient(dyna);
                cashier.setIncomSumma(dyna.getName());
                report = new Report(this.name, dyna.getName(), Integer.toString(PriceCars.PRICE_DYNA.getPrice()),
                        Integer.toString(CostPrice.COST_PRICE_DYNA.getPrice()));
                setReports(report);
                report = null;
            }
        } else {
            System.out.println("У " + client.getName() + " отсутствует требуемая сумма денег");
            System.out.println("------------------------------------------------------------------");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getReports() {
        return reports;
    }

    public void setReports(Report report) {
        String[] copyTmp = new String[Report.countReports];
        if (reports.length != Report.countReports) {
            for (int i = 0; i < reports.length; i++) {
                copyTmp[i] = reports[i];
            }
        }
        reports = new String[copyTmp.length];
        for (int i = 0; i < reports.length; i++) {
            reports[i] = copyTmp[i];
        }
        reports[Report.countReports - 1] = report.getManagerName() + "," + report.getNameCar()  + ","
                + report.getPriceCars() + "," + report.getCostPrice();
        System.out.println("------------------------------------------------------------------");
    }

    public void getReportsToFile(String[] reports) throws IOException {
        String fileName = "report.txt";
        int sumCostPrice = 0;
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(this.name + "\n");
            String str = "";
            for (int i = 0; i < reports.length; i++) {
                String[] strArr = reports[i].split(",");
                str += strArr[1] + " №" + (i + 1) + " - " + strArr[2] + " - " + strArr[3] + "\n";
                sumCostPrice += Integer.parseInt(strArr[3]);
            }
            fileWriter.write(str);
            fileWriter.write("Итог: доходы - " + Cashier.getIncomSumma() + ", расходы: " + sumCostPrice
                    + ", прибыль - " + (Cashier.getIncomSumma() - sumCostPrice));
        }
    }
}
