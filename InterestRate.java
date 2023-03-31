/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trebas;

/**
 *
 * @author sofia
 */
import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period in years: ");
        double time = scanner.nextDouble();

        // Simple interest calculation
        double simpleInterest = (principal * rate * time) / 100;
        System.out.printf("Simple Interest for %.2f years is: %.2f\n", time, simpleInterest);

        // Compound interest calculation
        System.out.print("Enter the number of times interest is compounded in a year: ");
        int n = scanner.nextInt();

        double amount = principal * Math.pow((1 + (rate / (n * 100))), (n * time));
        double compoundInterest = amount - principal;

        System.out.printf("Compound Interest for %.2f years is: %.2f\n", time, compoundInterest);
    }
}