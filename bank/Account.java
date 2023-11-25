package bank;

/**
 * bank
 */
public class Account {
   String owner;
    double balance;
    double minimumBalance;

    public void deposit(double amount) {
        balance += amount;
    }
    

    public void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }
} 