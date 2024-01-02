package factory;

public class PriceCar {
    private int dollar;
    private int cent;

    public PriceCar(int dollar, int cent) {
        this.dollar = dollar;
        this.cent = cent;
    }

    public int getDollar() {
        return dollar;
    }

    public void setDollar(int dollar) {
        this.dollar = dollar;
    }

    public int getCent() {
        return cent;
    }

    public void setCent(int cent) {
        this.cent = cent;
    }
}
