package com.bridgelabz;

import java.util.Scanner;

public class StockPortfolio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stock stock = new Stock();
        boolean flag = true;
        while (flag) {
            System.out.println("\n1.Add Stock \n2.Stock Report \n3.Exit");
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stock.addStock();
                    break;
                case 2:
                    stock.stockReport();
                    break;
                case 3:
                    flag = false;
                    System.out.println("Exited Successfully....");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
