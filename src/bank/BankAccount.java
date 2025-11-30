package bank;

public abstract class BankAccount implements Printable{
    protected String accountNumber;
    protected double balance;
    protected Customer owner;

    public BankAccount(String accountNumber, Customer owner,
                       double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " +
                balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: "
                    + balance);
        }else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public void printlnfo() {
        System.out.println("Account: " + accountNumber +
                "Owner:" + owner.getCustomerId() + " Balance: " + balance);
    }
}
