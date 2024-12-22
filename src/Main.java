public class Main {
    public static void main(String[] args) {
        Pizza basicPizza = new Pizza.PizzaBuilder("Medium", "Thin").build();
        Pizza customPizza = new Pizza.PizzaBuilder("Large", "Not Thin")
                                        .setExtraCheese(true)
                                        .setExtraSauce(false)
                                        .setToppings("Pepperoni, Mushrooms")
                                        .build();

        System.out.println(basicPizza);
        System.out.println(customPizza);
    }
}