/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculations;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = insert.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = insert.nextDouble();

        int choice = 0;
        while (choice != 0) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("0. Exit");

            choice = insert.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                case 4:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Calculation not recognized.");
                    break;
            }
        }
    }
}