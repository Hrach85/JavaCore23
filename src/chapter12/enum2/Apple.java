package chapter12.enum2;

public enum Apple {
    JONATHON(10), GOLDENDEL(9), REDDEL(12), WINESAP(15), CORTlAND(8);

    private int price;

    Apple(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }
}
