package com.timbuchalka.scope;

//section 12, lecture 125
//Scope Challenge

// Write a small program to read an integer from the keyboard
// (using Scanner) and print out the times table for that number.
// The table should run from 1 to 12.
//
// You are allowed to use one variable called scanner for your
// Scanner instance. You can use as many other variables as you
// need, but they must must all be called x. That includes any
// class instances and loop control variables that you may decide
// to use.
//
// If you use a class, the class can be called X (capital), but
// any instances of it must be called x (lower case).
//
// Any methods you create must also be called x.
//
// Optional Extra:
// Change your program so that ALL variables (including the scanner
// instance) are called x.

import java.util.Scanner;

public class ScopeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("1 * " + x + " = " + 1 * x);
        System.out.println("2 * " + x + " = " + 2 * x);
        System.out.println("3 * " + x + " = " + 3 * x);
        System.out.println("4 * " + x + " = " + 4 * x);
        System.out.println("5 * " + x + " = " + 5 * x);
        System.out.println("6 * " + x + " = " + 6 * x);
        System.out.println("7 * " + x + " = " + 7 * x);
        System.out.println("8 * " + x + " = " + 8 * x);
        System.out.println("9 * " + x + " = " + 9 * x);
        System.out.println("10 * " + x + " = " + 10 * x);
        System.out.println("11 * " + x + " = " + 11 * x);
        System.out.println("12 * " + x + " = " + 12 * x);
    }
}
