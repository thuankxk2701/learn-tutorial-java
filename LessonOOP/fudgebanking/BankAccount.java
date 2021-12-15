package fudgebanking;

public class BankAccount {

    private final String pinNumber;
    private double balance;


    public BankAccount(String pin, double balance) {
        this.pinNumber = pin;
        this.balance = balance;
    }


    public void Deposit(double amount) {
        this.balance = this.balance + amount;
    }


    public void Withdrawl(double amount) {
        this.balance = this.balance - amount;
    }


    public double Balance() {
        return this.balance;
    }


    public String Pin() {
        return this.pinNumber;
    }


    @Override
    public String toString() {
        return String.format("PIN#: %s\nBALANCE: $%.2f"
                ,this.pinNumber, this.balance);
    }
}
