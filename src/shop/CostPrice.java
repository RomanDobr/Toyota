package shop;

public enum CostPrice {
    COST_PRICE_CAMRY("CAMRY", 5_000),
    COST_PRICE_SOLARA("SOLARA", 8_000),
    COST_PRICE_HIANCE("HIANCE", 10_000),
    COST_PRICE_DYNA("DYNA", 12_000);
    private String nameCar;
    private int price;

    CostPrice(String nameCar, int price) {
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
