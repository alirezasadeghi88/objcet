package bank;

public class Customer extends Person{
    private String customerId;

    public Customer(String name, int age, Address address ,
                    String customerId) {
        super(name, age, address);
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public void printlnfo() {
        System.out.println("Customer: " + name + " | ID: " +
                customerId + " | Address: " + address);
    }
}
