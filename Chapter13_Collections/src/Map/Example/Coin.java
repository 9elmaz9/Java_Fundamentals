package Map.Example;

public enum Coin {

    ONE_CENT(0.01),
    TWO_CENT(0.02),
    FIVE_CENT(0.05),
    TEN_CENT(0.10),
    TWENTY_CENT(0.20),
    FIFTY_CENT(0.50),
    ONE_EURO(1),

    TWO_EUROS(2);

    private double value;

    Coin(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                '}';
    }
}




