package bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BankSystem {
    private ArrayList<Customer>customers = new ArrayList<>();
    private ArrayList<BankAccount>accounts = new ArrayList<>();

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public void addAccount(BankAccount a) {
        accounts.add(a);
    }

    public void printAllCustomers() {
        System.out.println("----- Customers -----");
        for (Customer a : customers) {
            a.printlnfo();
        }
    }

    public void printAllAccounts() {
        System.out.println("----- Accounts -----");
        for (BankAccount a : accounts) {
            a.printlnfo();
        }
    }

    public void sortCustomersByName() {
        customers.sort(Comparator.comparing(c -> c.name));
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount a : accounts) {
            if (a.accountNumber.equals(accountNumber)) {
                return a;
            }
        }
        return null;
    }
}
