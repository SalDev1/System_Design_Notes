package LLD.DesignShoppingCartWithApplyCoupons;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator {
   Product product;
   int discountPercentage;

   ProductType productType;

   static List<Product> eligibleTypes = new ArrayList<>();
   
   static {
    eligibleTypes.add(ProductType.FURNITURE_GOODS);
    eligibleTypes.add(ProductType.DECORATIVE_GOODS);
   }
    
   TypeCouponDecorator(Product product, int percentage, ProductType type) {
        this.product = product;
        this.discountPercentage = percentage;
        this.productType = type;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        if (eligibleTypes.contains(productType)) {
            return price - (price * discountPercentage / 100);
        }
        return product.getPrice();
    }
}
