package com.astronity.oop.encapsulation;

public class Account {
    private int balance;

    public void credit(int amount) throws InvalidCreditOperation
    {
        if ( amount > 0 ) this.balance += amount;
        else throw new InvalidCreditOperation("Invalid credit amount: " + amount);
    }

    public void debit(int amount) throws InvalidDebitOperation
    {
        if (amount > 0 && amount <= balance) this.balance -= amount;
        else throw new InvalidDebitOperation("Invalid debit amount: " + amount);
    }

    public int getBalance() {
        return balance;
    }
}
