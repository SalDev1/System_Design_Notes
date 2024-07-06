import java.util.Map;

public class Order {
    User user;
    Address deliveryAddress;
    Warehouse warehouse;
    Map<Integer , Integer> productCategoryAndCountMap;
    Invoice invoice;
    Payment payment;
    OrderStatus orderStatus;

    Order(User user , Warehouse warehouse) {
        this.user = user;
        this.warehouse = warehouse;
        this.productCategoryAndCountMap = user.getUserCart().getCartItems();
        this.deliveryAddress = user.address;
        invoice = new Invoice();
        invoice.generateInvoice(this);
    }

    public void checkout() {
        // 1. update inventory
        warehouse.removeItemFromInventory(productCategoryAndCountMap);

        // 2. make payment.
        boolean isPaymentSuccess = makePayment(new UPIPaymentMode());

        //3 . make cart empty
        if(isPaymentSuccess) {
            user.getUserCart().emptyCart();
        } else {
            warehouse.addItemToInventory(productCategoryAndCountMap);
        }
    }

    public boolean makePayment(PaymentMode paymentMode) {
        payment = new Payment(paymentMode);
        return payment.makePayment();
    }

    public void generateOrderInvoice() {
        invoice.generateInvoice(this);
    }
}
