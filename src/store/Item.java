package store;

public abstract class Item implements Printable{
    protected String name;
    protected String productId;
    protected double price;

    public Item(String name, String productId, double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    public abstract double calculateDiscount();

    @Override
    public void printInfo() {
        System.out.println("Product ID: " + productId + " | Name: " + name
                + " | Price: $" + price + " | Discounted Price: $" + (price - calculateDiscount()));
    }

    public double getPrice() {
        return price;
    }
}

