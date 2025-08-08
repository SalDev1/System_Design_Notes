package LLD.DesignCompanyCoffeeMachine;

public class CoffeeReceipe {
    int sugarQuantity;
    int milkQuantity;
    int coffeePowderQuantity;

    CoffeeReceipe( int sugarQuan , int milkQuan, int coffeePowderQuan) {
        this.sugarQuantity  = sugarQuan;
        this.milkQuantity = milkQuan;
        this.coffeePowderQuantity = coffeePowderQuan;
    }


    public int getSugarQuantity() {
        return sugarQuantity;
    }




    public void setSugarQuantity(int sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }

    public int getMilkQuantity() {
        return milkQuantity;
    }




    public void setMilkQuantity(int milkQuantity) {
        this.milkQuantity = milkQuantity;
    }




    public int getCoffeePowderQuantity() {
        return coffeePowderQuantity;
    }




    public void setCoffeePowderQuantity(int coffeePowderQuantity) {
        this.coffeePowderQuantity = coffeePowderQuantity;
    }




    public void prepareCoffee(CoffeeType coffeeType) {
        System.out.println("Preparing coffee " + coffeeType.getCoffeeName());
    }
}
