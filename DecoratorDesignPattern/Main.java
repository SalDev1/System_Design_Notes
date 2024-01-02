package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {

        // This is how Wrapper / Decorator Method is been used.

        /*
         * 
         * The very first thing I did , was to create a veg delight pizza
         * then add extracheese and extraChicken as a topping.
         * 
         * I can add as many layers as I can and each wrapper is itself a BasePizza.
         */
        BasePizza bp = new ExtraChicken(new ExtraCheese(new VegDelight()));
        System.out.println(bp.cost());
    }
}
