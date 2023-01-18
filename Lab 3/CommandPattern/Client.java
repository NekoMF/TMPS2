package CommandPattern;

public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Customer customer = new Customer("Samanta");
        Order order = new Order("Pizza");
        Food f = waiter.takeOrder(customer, order);

        System.out.println(f);
    }
}
