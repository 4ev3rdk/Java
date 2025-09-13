package com.dev;

import java.util.Scanner;
public class J03_Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a=input.nextInt();
         if(a%2==0) {
             System.out.println(a + " is even Number");
         }
         else {
             System.out.println(a + " is Odd Number");
         }
    }
}
