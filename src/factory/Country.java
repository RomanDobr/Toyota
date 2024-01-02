package factory;

public enum Country {
    RUSSIA("Россия"),
    USA("США"),
    JAPAN("Япония"),
    AUSTRALIA("Австралия"),
    CHINA("Китай"),
    THAILAND("Таиланд");
    private String name;
    Country(String name) {
        this.name = name;
    }
}
