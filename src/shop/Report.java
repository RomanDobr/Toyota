package shop;

import model.Dyna;

public class Report {
    private String managerName;
    private String nameCar;
    private String priceCars;
    private String costPrice;
    public static int countReports = 0;


    public Report(String managerName, String nameCar, String priceCars, String costPrice) {
        this.managerName = managerName;
        this.nameCar = nameCar;
        this.priceCars = priceCars;
        this.costPrice = costPrice;
        countReports++;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPriceCars() {
        return priceCars;
    }

    public void setPriceCars(String priceCars) {
        this.priceCars = priceCars;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getNameCar() {
        return nameCar;
    }
}
