
package LLD.DesignCompanyCoffeeMachine;

public class Main {

    public static void main(String[] args) {
        String machineId = "1";
        CoffeeMachineInventory coffeeMachineInventory = new CoffeeMachineInventory();

        // 1. Initialize the coffee machine
        CoffeeMachine coffeeMachine = new CoffeeMachine(machineId, coffeeMachineInventory);

        // 2. User selects an coffee option , Latte option.
        CoffeeType selectedCoffee = coffeeMachine.selectCoffee(2);

        // 3. Alert the user of the payment.
        coffeeMachine.paymentCoffeeAlert(selectedCoffee);

        // 4. User pays for the coffee and receive it
        coffeeMachine.payForCoffee(150, selectedCoffee);
    }
}