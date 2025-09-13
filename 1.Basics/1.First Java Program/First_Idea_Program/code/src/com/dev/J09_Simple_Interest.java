package com.dev;

import java.util.Scanner;

public class J09_Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal Amount:");
        float p= input.nextFloat();
        System.out.println("Enter Rate per year :");
        float r= input.nextFloat();
        System.out.println("Enter time in months:");
        float m = input.nextInt();
        float t= m/12;

        float si = (p * r * t)/100;

        System.out.println("Simple interest after " + t + " years is " +si);
        System.out.println("Total Loan amount is " + (si + p));

    }
}
