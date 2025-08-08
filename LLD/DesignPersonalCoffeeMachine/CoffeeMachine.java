package LLD.DesignPersonalCoffeeMachine;

public interface CoffeeMachine {
    public void updateCoffeeMachine(int milk, int coffeePowder , int sugar);

    public void createCoffee(CoffeeType coffeeType,int milk, int coffeePowder , int sugar);
}
