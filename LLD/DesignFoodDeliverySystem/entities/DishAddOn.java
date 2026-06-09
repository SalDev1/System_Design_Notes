package LLD.DesignFoodDeliverySystem.entities;


public class DishAddOn {
    public int dishAddOnId;
    public String dishAddOnName;
    public double price;
    public boolean isDishAddOnAvailable;

    public DishAddOn(int dishAddOnId, String dishAddOnName, double price, boolean isDishAddOnAvailable) {
        this.dishAddOnId = dishAddOnId;
        this.dishAddOnName = dishAddOnName;
        this.price = price;
        this.isDishAddOnAvailable = isDishAddOnAvailable;
    }
}
