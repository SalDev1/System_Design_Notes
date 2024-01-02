package DecoratorDesignPattern;

public class ExtraChicken extends ToppingDecorator {

    BasePizza basePizza;

    ExtraChicken(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return basePizza.cost() + 35;
    }
}
