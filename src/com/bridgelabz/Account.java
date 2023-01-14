package com.bridgelabz;

import java.util.Scanner;

public class Account {

    int balance;
    Scanner sc = new Scanner(System.in);

    public Account(int initialBalance) {
        if (initialBalance > 0)
           balance = initialBalance;
    }

    public void debit(int debitAmount) {
        if (debitAmount > balance) {
            System.out.println("Debit amount exceeded account balance");
        }else
            balance = balance - debitAmount;

    }
    public int getBalance() {

        return balance;
    }
    public void creditAmount(int amount) {

        balance = balance + amount;

    }
}
