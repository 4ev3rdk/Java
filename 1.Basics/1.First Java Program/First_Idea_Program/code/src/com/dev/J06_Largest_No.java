package com.dev;

import java.util.Scanner;

public class J06_Largest_No {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " and " + b + " are equal");
        }
    }
}

