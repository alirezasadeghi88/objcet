package bank;

public class Main {
    public static void main(String[] args) {

        BankSystem bank= new BankSystem();

        Customer c1= new Customer("Ali", 30, new
                Address("Tehran", "Valiasr"), "C101");
        Customer c2 = new Customer("Sara", 28, new
                Address("Shiraz", "Zand"), "C102");

        bank.addCustomer(c1);
        bank.addCustomer(c2);

        BankAccount a1 = new CheckingAccount("A001", c1, 5000);
        BankAccount a2 = new SavingAccount("A002", c2,10000,5);

        bank.addAccount(a1);
        bank.addAccount(a2);

        System.out.println("\n--- All Customers ---");
        bank.printAllCustomers();

        System.out.println("\n--- All Accounts ---");
        bank.printAllCustomers();

        System.out.println("\n--- Deposit and Withdraw ---");
        a1.deposit(1000);
        a2.withdraw(2000);

        System.out.println("\n--- Transfer Money ---");
        ((CheckingAccount)a1).transfer(1500, a2);

        System.out.println("\n--- Add Interest to Saving ---");
        ((SavingAccount)a2).addInterrest();

        System.out.println("\n--- Sorted Customers by Name ---");
        bank.sortCustomersByName();
        bank.printAllCustomers();
    }
}
