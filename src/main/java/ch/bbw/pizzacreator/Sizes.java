package ch.bbw.pizzacreator;

import static ch.bbw.pizzacreator.Pizza.getFormattedPrice;

public enum Sizes {
    SMALL("small", 1500),
    MEDIUM("medium", 1550),
    LARGE("large", 1600),
    EXTRA_LARGE("extra large", 1650);

    private final String text;
    private final int price;
    Sizes(String text, int price) {
        this.text = text;
        this.price = price;
    }

    public String getText() {
        return text;
    }
    public String getPrice() {
        return getFormattedPrice(price);
    }
    public int price(){
        return price;
    }
}
