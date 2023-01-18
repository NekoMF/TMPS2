package CommandPattern;

public class Food {
    Order order;


    public Food(Order order) {
        this.order = order;
    }

    public String toString() {
        return order.getCommand() + " has completed";
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
