package LLD.DesignShoppingCartWithApplyCoupons;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productsList;

    public ShoppingCart() {
        productsList = new ArrayList<>();
    }

    public void addToCart(Product product) {
        Product productWithEligibleDiscount = 
          new TypeCouponDecorator(new PercentageCouponDecorator(product , 10) , 3 , product.getType());

        productsList.add(productWithEligibleDiscount);
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Product product : productsList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
