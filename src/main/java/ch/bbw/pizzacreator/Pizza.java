package ch.bbw.pizzacreator;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
    public class Topping {
        private String name;
        private int price;
        private boolean chosen;
        public Topping(String name, int price, boolean chosen) {
            this.name = name;
            this.price = price;
            this.chosen = chosen;
        }
        public Topping(String name, int price) {
            this.name = name;
            this.price = price;
            this.chosen = false;
        }

        public String getName() {
            return name;
        }
        public String getPrice() {
            return getFormattedPrice(price);
        }
        public boolean isChosen() {
            return chosen;
        }
        public void setChosen(boolean chosen) {
            this.chosen = chosen;
        }
    }

    private ArrayList<Topping> toppings = new ArrayList<>(Arrays.asList(
        new Topping("Tomato", 150),
        new Topping("Olive", 150),
        new Topping("Sardine", 150),
        new Topping("Salami", 150)
    ));
    private Sizes size;
    private String name;
    private int total;

    public String getTotal() {
        return getFormattedPrice(this.total);
    }
    public void calculateTotal() {
        this.total = 0;

        for(Topping i : toppings) {
            if(i.chosen) this.total += i.price;
        }
        this.total += size.price();
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }
    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }

    public Sizes getSize() {
        return size;
    }
    public void setSize(Sizes size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static String getFormattedPrice(int price) {
        return String.format("CHF %10.2f", price / 100.0);
    }
}
