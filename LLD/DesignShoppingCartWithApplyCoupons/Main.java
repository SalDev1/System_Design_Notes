package LLD.DesignShoppingCartWithApplyCoupons;

public class Main {
    Product item1 = new Item1("FAN", 1000.0, ProductType.ELECTRONICS);
    Product item2 = new Item2("MOBILE", 2000.0, ProductType.ELECTRONICS);

    ShoppingCart cart = new ShoppingCart();
    cart.addToCart(item1);
    cart.addToCart(item2);

    System.out.println("Total Price after discount: " + cart.getTotalPrice());
}