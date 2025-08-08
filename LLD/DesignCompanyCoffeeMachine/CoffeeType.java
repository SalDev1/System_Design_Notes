package LLD.DesignCompanyCoffeeMachine;

public class CoffeeType {
    String coffeeName;
    CoffeeReceipe coffeeReceipe;
    int price;

    CoffeeType(String coffeeName , CoffeeReceipe coffeeReceipe , int price) {
        this.coffeeName = coffeeName;
        this.coffeeReceipe = coffeeReceipe;
        this.price = price;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public CoffeeReceipe getCoffeeReceipe() {
        return coffeeReceipe;
    }

    public void setCoffeeReceipe(CoffeeReceipe coffeeReceipe) {
        this.coffeeReceipe = coffeeReceipe;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
