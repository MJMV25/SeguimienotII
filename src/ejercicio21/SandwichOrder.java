package ejercicio21;

public class SandwichOrder {
    private String size;
    private boolean hasBacon;
    private boolean hasJalapeno;
    private boolean hasTurkey;
    private boolean hasCheese;

    private final int SMALL_PRICE = 6000;
    private final int LARGE_PRICE = 12000;
    private final int BACON_PRICE = 3000;
    private final int TURKEY_PRICE = 3000;
    private final int CHEESE_PRICE = 2500;

    public SandwichOrder(String size, boolean hasBacon, boolean hasJalapeno, boolean hasTurkey, boolean hasCheese) {
        this.size = size.toLowerCase();
        this.hasBacon = hasBacon;
        this.hasJalapeno = hasJalapeno;
        this.hasTurkey = hasTurkey;
        this.hasCheese = hasCheese;
    }

    public int calculateTotal() {
        int total = 0;

        if (size.equals("pequeño")) {
            total += SMALL_PRICE;
        } else if (size.equals("grande")) {
            total += LARGE_PRICE;
        } else {
            throw new IllegalArgumentException("Tamaño no válido. Debe ser 'pequeño' o 'grande'.");
        }

        if (hasBacon) {
            total += BACON_PRICE;
        }

        if (hasTurkey) {
            total += TURKEY_PRICE;
        }

        if (hasCheese) {
            total += CHEESE_PRICE;
        }

        return total;
    }

    public String getSize() {
        return size;
    }

    public boolean hasBacon() {
        return hasBacon;
    }

    public boolean hasJalapeno() {
        return hasJalapeno;
    }

    public boolean hasTurkey() {
        return hasTurkey;
    }

    public boolean hasCheese() {
        return hasCheese;
    }
}
