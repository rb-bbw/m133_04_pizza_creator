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
        public int getPrice() {
            return price;
        }
        public boolean isChosen() {
            return chosen;
        }
        public void setChosen(boolean chosen) {
            this.chosen = chosen;
        }
    }
    public class Size {
        private String name;
        private int price;
        private boolean chosen;
        public Size(String name, int price, boolean chosen) {
            this.name = name;
            this.price = price;
            this.chosen = chosen;
        }
        public Size(String name, int price) {
            this.name = name;
            this.price = price;
            this.chosen = false;
        }

        public int getPrice() {
            return price;
        }
        public String getName() {
            return name;
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
        new Topping( "Olive", 150 ),
        new Topping( "Sardine", 150 ),
        new Topping( "Salami", 150 )
    ));
    private ArrayList<Size> sizes = new ArrayList<>(Arrays.asList(
            new Size("small", 1500),
            new Size("medium", 1550),
            new Size("large", 1600),
            new Size("extra large", 1650)
    ));
    private String name;
    private int total;

    public int getTotal() {
        return total;
    }
    public void calculateTotal() {
        this.total = 0;

        for (Topping i : toppings) {
            this.total += i.price;
        }
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }
    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }

    public ArrayList<Size> getSizes() {
        return sizes;
    }
    public void setSizes(ArrayList<Size> sizes) {
        this.sizes = sizes;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
