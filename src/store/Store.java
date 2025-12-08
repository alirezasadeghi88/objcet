package store;

import java.util.ArrayList;
import java.util.Collections;

public class Store {
    private ArrayList<Item> products = new ArrayList<>();

    public void addProduct(Item item) {
        products.add(item);
    }

    public void removeProduct(String productId) {
        products.removeIf(p -> p.productId.equals(productId));
    }

    public void printAllProducts() {
        System.out.println("----- All Products -----");
        for (Item item : products) {
            item.printInfo();
        }
    }

    public void sortProductsByPrice() {
        Collections.sort(products, (a, b) -> Double.compare(a.getPrice(), b.getPrice()));
    }
}

