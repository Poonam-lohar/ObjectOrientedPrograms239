package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {

    ArrayList<String> stockName = new ArrayList<>();
    ArrayList<Integer> noOfShares = new ArrayList<>();
    ArrayList<Integer> sharePrice = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void addStock() {
        System.out.println("Enter the Stock name: ");
        stockName.add(sc.next());
        System.out.println("Enter number of Shares: ");
        noOfShares.add(sc.nextInt());
        System.out.println("Enter price of Share: ");
        sharePrice.add(sc.nextInt());
    }
    public void stockReport() {
        System.out.println("Stock Report...");
        for (int i=0;i<stockName.size();i++) {
            int total = (noOfShares.get(i) * sharePrice.get(i));
            System.out.println("\n Stock name : "+stockName.get(i) +"\n price of share: "+sharePrice.get(i)+"\n Total price of share: "+ total);
        }
    }
}

