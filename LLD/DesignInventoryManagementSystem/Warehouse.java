import java.util.Map;

public class Warehouse {
    Inventory inventory;
    Address address;

    public void removeItemFromInventory(Map<Integer, Integer> productCategoryAndCountMap) {
        inventory.removeItems(productCategoryAndCountMap);
    }

    public void addItemToInventory(Map<Integer, Integer> productCategoryAndCountMap) {
        // it will update the items in the inventory based upon product category.
    }
}
