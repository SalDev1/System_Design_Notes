package LLD.DesignCompanyCoffeeMachine;

public class CoffeeMachineInventory {
    int sugarQuantity;
    int milkQuantity;
    int coffeePowderQuantity;

    // Defining the coffee machine inventory with default ingredients;
    CoffeeMachineInventory() {
        sugarQuantity = 1000;
        milkQuantity = 1000;
        coffeePowderQuantity = 1000;
    }
    public void updateCoffeeIngredients(CoffeeType coffeeType) {
        sugarQuantity -= coffeeType.getCoffeeReceipe().getSugarQuantity();
        milkQuantity -= coffeeType.getCoffeeReceipe().getMilkQuantity();
        coffeePowderQuantity -= coffeeType.getCoffeeReceipe().getCoffeePowderQuantity();
    }
    public void refillAllIngredients() {
        sugarQuantity = 1000;
        milkQuantity = 1000;
        coffeePowderQuantity = 100;
    }

    public int getSugarQuantity() {
        return sugarQuantity;
    }

    public int getMilkQuantity() {
        return milkQuantity;
    }

    public int getCoffeePowderQuantity() {
        return coffeePowderQuantity;
    }
}
