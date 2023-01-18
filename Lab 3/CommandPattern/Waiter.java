package CommandPattern;

public class Waiter {
    public Food takeOrder(Customer customer, Order order) {
        Cook cook = new Cook();
        Food food = cook.prepareOrder(order, this);
        return food;
    }
}
