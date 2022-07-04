package Exercises_2;

public class BankAccount {
//    1.A class BankAccount(owner, accountNb, balance) with behavior: getAccountDetails(all details), deposit(), withdraw().
//      A class SavingsAccount that inherits class BankAccount and which can make: deposit, withdraw money.
//
//    I keep the current amount of money in a constant.
//
//    Implement the classes, add and withdraw money from the account and obtain the following sequence:
//
//    Account 09434242432232 with balance 1234.

    private String owner;
    String accountNb;
    float balance;


    public BankAccount(String owner, String accountNb, float balance) {
        this.owner = owner;
        this.accountNb = accountNb;
        this.balance = balance;
    }

    public String getAccountDetails() {
        final float CURRENT_MONEY = this.balance;
        return "Account no. " + this.accountNb + ", with balance " + CURRENT_MONEY + " RON , owner: " + this.owner;
    }

    public float deposit(float deposit) {
        System.out.println("Add " + deposit + " RON");
        return this.balance += deposit;
    }

    public float withdraw(float withdraw) {
        System.out.println("Withdraw " + withdraw + " RON");
        return this.balance -= withdraw;
    }

    public String getNameOwner() {
        return this.owner;
    }

}

