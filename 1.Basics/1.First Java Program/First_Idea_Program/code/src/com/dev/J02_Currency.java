package com.dev;

import java.util.Scanner;

public class J02_Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Rs to convert into USD :");
        int a=input.nextInt();
        float b = a/87.65f;
        System.out.println(a +  " RS in USD = " + b);
    }
}
