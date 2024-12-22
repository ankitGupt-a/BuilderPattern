public class Pizza {
    private final String size;
    private final String crust;
    private final boolean extraSauce;
    private final boolean extraCheese;
    private final String toppings;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.crust = pizzaBuilder.crust;
        this.extraSauce = pizzaBuilder.extraSauce;
        this.extraCheese = pizzaBuilder.extraCheese;
        this.toppings = pizzaBuilder.toppings;
    }

    public String toString() {
        return "Pizza [Size=" + size + ", Crust=" + crust +
                ", ExtraCheese=" + extraCheese +
                ", ExtraSauce=" + extraSauce +
                ", Toppings=" + toppings + "]";
    }

    public static class PizzaBuilder {
        private final String size; //mandatory;
        private final String crust; //mandatory;

        private boolean extraSauce = false;
        private boolean extraCheese = false;
        private String toppings = "";

        public PizzaBuilder(final String size, final String crust) {
            this.size = size;
            this.crust = crust;
        }

        public PizzaBuilder setExtraCheese(final boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public PizzaBuilder setExtraSauce(final boolean extraSauce) {
            this.extraSauce = extraSauce;
            return this;
        }

        public PizzaBuilder setToppings(final String toppings) {
            this.toppings = toppings;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }

}
