package store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalProduct dp1 = new DigitalProduct("Java Ebook", "D101", 20.0, 50);
        DigitalProduct dp2 = new DigitalProduct("Photoshop License", "D102", 100.0, 10);
        PhysicalProduct pp1 = new PhysicalProduct("Laptop", "P101", 1200.0, 5);
        PhysicalProduct pp2 = new PhysicalProduct("Notebook", "P102", 5.0, 100);

        store.addProduct(dp1);
        store.addProduct(dp2);
        store.addProduct(pp1);
        store.addProduct(pp2);

        System.out.println("\n--- All Products ---");
        store.printAllProducts();

        System.out.println("\n--- Selling Some Products ---");
        dp1.sell(5);
        pp1.sell(2);

        System.out.println("\n--- Sorted Products by Price ---");
        store.sortProductsByPrice();
        store.printAllProducts();
    }
}

