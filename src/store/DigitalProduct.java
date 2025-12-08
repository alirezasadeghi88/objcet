package store;

public class DigitalProduct extends Item implements Sellable,
        Comparable<DigitalProduct> {
    private int quantity;

    public DigitalProduct(String name, String productId, double price, int quantity) {
        super(name, productId, price);
        this.quantity = quantity;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10; // تخفیف 10 درصد
    }

    @Override
    public void sell(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            System.out.println(quantity + " digital items sold. Remaining: " + this.quantity);
        } else {
            System.out.println("Not enough stock!");
        }
    }

    @Override
    public int compareTo(DigitalProduct other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public void printInfo() {
        System.out.print("Digital → ");
        super.printInfo();
        System.out.println("Quantity: " + quantity);
    }
}

