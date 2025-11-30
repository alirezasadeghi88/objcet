package bank;

public class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingAccount(String accountNumber, Customer
            owner, double balance, double interestRate) {
        super(accountNumber, owner, balance);
        this.interestRate = interestRate;
    }

    public void addInterrest() {
        double interest = balance * interestRate / 100;
        balance -= interest;
        System.out.println("Interest added: " + interest +
                " | New balance: " + balance);
    }

    @Override
    public void printlnfo() {
        System.out.println("Saving Account → ");
        super.printlnfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
