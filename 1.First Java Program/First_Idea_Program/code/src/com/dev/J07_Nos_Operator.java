package com.dev;

import java.util.Scanner;

public class J07_Nos_Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a= input.nextInt();
        int b = input.nextInt();
        System.out.println("Enter the operand");
        String c =input.next();

        if(c.equals("+")) {
            System.out.println(a+b);
        }
        else if (c.equals("-"))
        {
            System.out.println(a-b);
        }
        else if(c.equals("*")) {
            System.out.println(a*b);
        }
        else {
            System.out.println(a/b);
        }

    }
}
