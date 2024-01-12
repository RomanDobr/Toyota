package shop;

public enum PriceCars {
    PRICE_CAMRY("CAMRY", 10_000),
    PRICE_SOLARA("SOLARA", 12_000),
    PRICE_HIANCE("HIANCE", 15_000),
    PRICE_DYNA("DYNA", 22_000);

    private String nameCar;
    private int price;

    PriceCars(String nameCar, int price) {
        this.nameCar = nameCar;
        this.price = price;
    }

    public String getNameCar() {
        return nameCar;
    }

    public int getPrice() {
        return price;
    }
}
