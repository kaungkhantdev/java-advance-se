package com.astronity.oop.encapsulation;

public class ClientDemo {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("Current balance: " + account.getBalance());

        try {
            account.credit(100);
//            account.debit(200);
            account.debit(10);
            System.out.println("Balance: " + account.getBalance());
        } catch (InvalidDebitOperation | InvalidCreditOperation e) {
            System.out.println(e.getMessage());
        }

    }
}
