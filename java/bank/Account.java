package java.bank;

/**
 * bank
 */
public class Account {
    private String owner;
    private double balance;
    private double minimumBalance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public double calculateCreditWorthiness() {
        return balance * 0.5;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }}

