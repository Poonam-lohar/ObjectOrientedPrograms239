package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account(1000);
        System.out.println("....Welcome To Banking System....");
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Choice:\n1. Check Balance \n2.Debit \n3.Credit \n4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Account Balance: "+account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter Amount For Withdraws: ");
                    int debitAmount = sc.nextInt();
                    account.debit(debitAmount);
                    break;
                case 3:
                    System.out.println("Enter Amount For credit: ");
                    int creditAmount = sc.nextInt();
                    account.creditAmount(creditAmount);
                    break;
                case 4:
                    flag = false;
                    System.out.println("Exited Successfully.........");
                    break;
                default:
                    System.out.println("Invalid Choice....");

            }
        }
    }
}
