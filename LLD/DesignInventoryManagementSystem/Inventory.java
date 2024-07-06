import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {
    List<ProductCategory> productCategoryList;

    Inventory() {
        productCategoryList = new ArrayList<>();
    }

    // Add new Category.
    public void addCategory(int categoryId, String name, int price) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.productCategoryId = categoryId;
        productCategory.price = price;
        productCategory.categoryName = name;
        productCategoryList.add(productCategory);
    }

    // Add new product in a specific category.
    public void addProduct(Product product , int productCategoryId) {
        ProductCategory categoryObject = null;

        // Fetch out the category details first.
        for(ProductCategory productCategory : productCategoryList) {
            if(productCategory.productCategoryId == productCategoryId) {
                categoryObject = productCategory;
            }
        }

        if(categoryObject != null) {
            categoryObject.addProduct(product);
        }
    }

    public void removeItems(Map<Integer,Integer> productCategoryAndCountMap) {
        for(Map.Entry<Integer,Integer> entry : productCategoryAndCountMap.entrySet()) {
            ProductCategory category = getProductCategoryFromID(entry.getKey());
            category.removeProduct(entry.getValue());
        }
    }

    private ProductCategory getProductCategoryFromID(int productCategoryId) {
        for(ProductCategory productCategory : productCategoryList) {
            if(productCategory.productCategoryId == productCategoryId) {
                return productCategory;
            }
        }
        return null;
    }
}
