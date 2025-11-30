package bank;

public class CheckingAccount extends BankAccount implements Transferable{
    public CheckingAccount(String accountNumber, Customer
            owner, double balance) {
        super(accountNumber, owner, balance);
    }

    @Override
    public void transfer(double amount, BankAccount toAccount) {
        if (amount <= balance) {
            balance -= amount;
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to account"
                + toAccount.accountNumber);
        }else {
            System.out.println("Insufficient funds for transfer!");
        }
    }

    @Override
    public void printlnfo() {
        System.out.println("Checking Account → ");
        super.printlnfo();
    }
}
