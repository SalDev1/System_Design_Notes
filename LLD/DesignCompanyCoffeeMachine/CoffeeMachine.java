package LLD.DesignCompanyCoffeeMachine;

public class CoffeeMachine {
    String machineId; 
    CoffeeMachineInventory coffeeMachineInventory;

    CoffeeMachine(String id , CoffeeMachineInventory coffeeMachineInventory) {
        this.machineId = id;
        this.coffeeMachineInventory = coffeeMachineInventory;
    }

    public CoffeeType selectCoffee(int option) {
        switch(option) {
            case 1: 
               return new CoffeeType("Cappuccino", new CoffeeReceipe(20, 20, 20), 100);
            case 2 : 
              return new CoffeeType("Espresso", new CoffeeReceipe(15, 15, 15), 150);
            case 3 :  
              return new CoffeeType("Latte", new CoffeeReceipe(40, 40, 40), 125);
            default :
              return new CoffeeType("Unknown", new CoffeeReceipe(0, 0, 0), 125);
        }
    }

    public void paymentCoffeeAlert(CoffeeType coffeeType) {
        System.out.println("Please make payment of the selected coffee : " + coffeeType.getPrice() + " rupees");
    }

    public void prepareCoffee(CoffeeType coffee) {
        if(coffee.getCoffeeReceipe().getMilkQuantity() > coffeeMachineInventory.getMilkQuantity() && coffee.getCoffeeReceipe().getSugarQuantity() > coffeeMachineInventory.getSugarQuantity() && coffee.getCoffeeReceipe().getCoffeePowderQuantity() > coffeeMachineInventory.getSugarQuantity()) {
            System.out.println("Ingredients are quite less , refilling the coffee machine immediately");
            coffeeMachineInventory.refillAllIngredients();
        } else {
            coffeeMachineInventory.updateCoffeeIngredients(coffee);
        }
    }

    public void payForCoffee(int amount, CoffeeType coffee) {
        if(coffee.getPrice() == amount) {
            prepareCoffee(coffee);
            coffeeMachineInventory.updateCoffeeIngredients(coffee);
            System.out.println("Your " + coffee.getCoffeeName() + " is hot and ready !");
        } else {
            System.out.println("Insufficent Amount , Try again later");
        }
    }
}
