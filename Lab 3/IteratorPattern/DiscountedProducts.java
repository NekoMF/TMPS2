package IteratorPattern;

public class DiscountedProducts implements Iterable {
   /* public String discountedProducts[] = {"Perfume", "Soap",
            "Toothpaste", "Sampoo", "Handwash"};*/

    public int[] discountedProducts = {1,2,3,4,5,6};

    public Iterator getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < discountedProducts.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return discountedProducts[index++];
            }
            return null;
        }
    }
}

