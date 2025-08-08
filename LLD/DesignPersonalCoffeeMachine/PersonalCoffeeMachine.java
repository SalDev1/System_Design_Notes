package LLD.DesignPersonalCoffeeMachine;

public class PersonalCoffeeMachine implements CoffeeMachine {
    String coffeeMachineId; 
    int milkAmount;
    int coffeePowderAmount; 
    int sugarAmount; 

    PersonalCoffeeMachine(String coffeeMachineId, int milkAmount, int coffeePowderAmount, int sugarAmount) {
        this.coffeeMachineId = coffeeMachineId;
        this.milkAmount = milkAmount;
        this.coffeePowderAmount = coffeePowderAmount;
        this.sugarAmount = sugarAmount;
    }

    public CoffeeType selectCoffeeType(int option) {
        switch(option) {
            case 1:
             return CoffeeType.ESPRESSO;
            case 2 : 
             return CoffeeType.CAPPUCCINO;
            case 3 : 
              return CoffeeType.LATTE;
            default : 
              return CoffeeType.CAPPUCCINO;
        }
    }

    public String getCoffeeType(CoffeeType coffeeType) {
          switch(coffeeType) {
            case ESPRESSO:
             return "ESPRESSO";
            case CAPPUCCINO : 
             return "CAPPUCCINO";
            case LATTE : 
              return "LATTE";
            default : 
              return "";
        }
    }

    @Override
    public void updateCoffeeMachine(int milk, int coffeePowder, int sugar) {
        if(milk == 0 || coffeePowder == 0 || sugar == 0) {
            System.out.println("Insufficient ingredients to make up the selected coffee");
            return;
        }
        milkAmount -= milk;
        coffeePowderAmount -= coffeePowder;
        sugarAmount -= sugar;
    }

    @Override
    public void createCoffee(CoffeeType coffeeType , int milkAmount, int coffeePowderAmount , int sugarAmount) {
       updateCoffeeMachine(milkAmount, coffeePowderAmount, sugarAmount);
       System.out.println("Your coffee is ready : " + getCoffeeType(coffeeType));
    }
}
