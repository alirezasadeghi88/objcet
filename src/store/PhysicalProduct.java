package store;

public class PhysicalProduct extends Item implements Sellable,
        Comparable<PhysicalProduct> {
    private int quantity;

    public PhysicalProduct(String name, String productId, double price, int quantity) {
        super(name, productId, price);
        this.quantity = quantity;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05; // تخفیف 5 درصد
    }

    @Override
    public void sell(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            System.out.println(quantity + " physical items sold. Remaining: " + this.quantity);
        } else {
            System.out.println("Not enough stock!");
        }
    }

    @Override
    public int compareTo(PhysicalProduct other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public void printInfo() {
        System.out.print("Physical → ");
        super.printInfo();
        System.out.println("Quantity: " + quantity);
    }
}

