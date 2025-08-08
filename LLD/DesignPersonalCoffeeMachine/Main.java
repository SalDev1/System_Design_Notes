package LLD.DesignPersonalCoffeeMachine;

public class Main {
    public static void main(String[] args) {
        PersonalCoffeeMachine coffeeMachine = new PersonalCoffeeMachine("1",200,200,200);   
        CoffeeType selectedCoffee = coffeeMachine.selectCoffeeType(1);

        coffeeMachine.createCoffee(selectedCoffee, 20, 20, 20);
    }
}
