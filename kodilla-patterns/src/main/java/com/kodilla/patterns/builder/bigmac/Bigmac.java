package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    static final String STANDARDBUN = "Standard bun";
    static final String SESAMEBUN = "Sesame bun";
    static final String STANDARDSAUCE = "Standard sauce";
    static final String THOUSANDISLANDSSAUCE = "1000 Islands sauce";
    static final String BARBECUESAUCE = "Barbecue sauce";
    static final String LETTUCE = "Lettuce";
    static final String ONION = "Onion";
    static final String BACON = "Bacon";
    static final String CUCUMBER = "Cucumber";
    static final String CHILIPEPPERS = "Chili peppers";
    static final String MUSHROOMS = "Mushrooms";
    static final String SHRIMPS = "Shrimps";
    static final String CHEESE = "Cheese";
    private static final List<String> VALIDBUNS = new ArrayList<String>() {{
        add(STANDARDBUN);
        add(SESAMEBUN);
    }};
    private static final List<String> VALIDSAUCES = new ArrayList<String>() {{
        add(STANDARDSAUCE);
        add(THOUSANDISLANDSSAUCE);
        add(BARBECUESAUCE);
    }};
    private static final List<String> VALIDINGREDIENTS = new ArrayList<String>() {{
        add(LETTUCE);
        add(ONION);
        add(BACON);
        add(CUCUMBER);
        add(CHILIPEPPERS);
        add(MUSHROOMS);
        add(SHRIMPS);
        add(CHEESE);
    }};

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if(VALIDBUNS.contains(bun)) {
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("Invalid bun: " + bun);
            }
        }
        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder sauce(String sauce) {
            if(VALIDSAUCES.contains(sauce)) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Invalid sauce: " + sauce);
            }
        }
        public BigmacBuilder ingredient(String ingredient) {
            if(VALIDINGREDIENTS.contains(ingredient)) {
                ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("Invalid ingredient: " + ingredient);
            }
        }
        public Bigmac build() {
            if(bun != null && burgers > 0 && burgers <4) {
                return new Bigmac(bun, burgers, sauce, ingredients);
            } else {
                throw new IllegalStateException("That cannot be a hamburger!");
            }
        }
    }
    public Bigmac(final String bun, final int burgers, final String sauce, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }
    public String getBun() {
        return bun;
    }
    public int getBurgers() {
        return burgers;
    }
    public String getSauce() {
        return sauce;
    }
    public List<String> getIngredients() {
        return ingredients;
    }
    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
