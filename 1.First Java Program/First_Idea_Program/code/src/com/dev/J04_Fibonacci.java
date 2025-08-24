package com.dev;

import java.util.Scanner;

public class J04_Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter the Number: ");
//        int d = input.nextInt();
//        int a=0, b=1;
//        int count= 2;
//
//        System.out.println(a);
//        System.out.println(b);
//
//        while(count <=d) {
//            int c=a+b;
//            a=b;
//            b= c;
//            System.out.println(c);
//            count++;
//        }
        int a=0;
        int b=1;
        int c=input.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<c;i++) {
            int next = a +b;
            a=b;
            b= next;
            System.out.print(next);

        }
    }
}
