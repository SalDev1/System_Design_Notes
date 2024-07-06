import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    int productCategoryId;
    String categoryName;
    List<Product> products = new ArrayList<>();
    double price;

    // adding products to the specific category.
    public void addProduct(Product p) {
        products.add(p);
    }
    // remove products from a category.
    public void removeProduct(int count) {
        for(int i = 1 ; i <= count ; i++) {
            products.remove(0);
        }
    }
}
