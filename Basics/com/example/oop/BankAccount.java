package com.example.oop;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String holder, double balance) {
        this.accountHolder = holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient funds");
        else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
    }

    public void showBalance() {
        System.out.println("Balance: $" + balance);
    }
}

