package com.example.java_basics;

import java.util.Scanner;

public class NprToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to convert: ");
        double amount = sc.nextDouble();
        double usd = amount / 136.5;
        System.out.printf("USD: %.2f", usd);
    }
}