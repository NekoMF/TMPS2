package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        DiscountedProducts discountedProducts = new DiscountedProducts();
        Iterator iterator = discountedProducts.getIterator();
        while(iterator.hasNext()) {
            int ana = (int) iterator.next();
            System.out.println("Product Name : " + ana);
        }
    }
}

