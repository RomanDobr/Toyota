package shop;

public class Cashier {
    private static int incomSumma = 0;
    public void setIncomSumma(String nameCar) {
        for (PriceCars value : PriceCars.values()) {
            if (nameCar.equals(value.getNameCar())) {
                incomSumma += value.getPrice();
            }
        }
    }
    public static int getIncomSumma() {
        return incomSumma;
    }
}
