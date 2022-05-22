package ch.bbw.pizzacreator;

import static ch.bbw.pizzacreator.Pizza.getFormattedPrice;

public enum Sizes {
    SMALL(1500),
    MEDIUM(1550),
    LARGE(1600),
    EXTRA_LARGE(1650);

    private final int price;
    Sizes(int price) {
        this.price = price;
    }

    public String getPrice() {
        return getFormattedPrice(price);
    }
    public int price(){
        return price;
    }
}
