import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderController {

    List<Order> orderList;
    Map<Integer , List<Order>> usersIdVsOrders;

    OrderController() {
        orderList = new ArrayList<>();
        usersIdVsOrders = new HashMap<>();
    }

    // create a new order.
    public Order createNewOrder(User user , Warehouse warehouse) {
        Order order = new Order(user , warehouse);
        orderList.add(order);

        if(usersIdVsOrders.containsKey(user.userId)) {
            List<Order> userOrders = usersIdVsOrders.get(user.userId);
            userOrders.add(order);
            usersIdVsOrders.put(user.userId,userOrders);
        } else {
            List<Order> userOrders= new ArrayList<>();
            userOrders.add(order);
            usersIdVsOrders.put(user.userId,userOrders);
        }
        return order;
    }

    // remove an order.
    public void removeOrder(Order order) {
        // remove order capability goes here.
    }
    public List<Order> getOrderByCustomerId(int userId) {
        return null;
    }
    public Order getOrderByOrderId(int orderId) {
        return null;
    }
}
