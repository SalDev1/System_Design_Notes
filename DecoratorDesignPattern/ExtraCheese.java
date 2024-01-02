package DecoratorDesignPattern;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;

    ExtraCheese(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return basePizza.cost() + 10;
    }
}
