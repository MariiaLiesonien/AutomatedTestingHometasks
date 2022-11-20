import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Task4 {

    public static void main(String[] args) {
        OrderList orders = new OrderList();
        orders.makeOrder("Cheeseburger");
        orders.makeOrder("BigTasty");
        orders.makeOrder("Cheeseburger");
        orders.makeOrder("Coca-Cola");
        orders.makeOrder("FrenchFries");

        HashSet<String> orders1 = new HashSet<String>(orders.getAllOrders());
        TreeSet<String> orders2 = new TreeSet<String>(orders.getAllOrders());
        System.out.println(orders1);
        System.out.println(orders2);
    }
}

class OrderList {
    private ArrayList<String> allOrders = new ArrayList<String>();

    public void makeOrder(String order) {
        allOrders.add(order);
    }

    public ArrayList<String> getAllOrders() {
        return allOrders;
    }
}
