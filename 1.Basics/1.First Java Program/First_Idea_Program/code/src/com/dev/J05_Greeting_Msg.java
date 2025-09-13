package com.dev;

import java.util.Scanner;

public class J05_Greeting_Msg {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name :");
        String name = input.next();
        System.out.println("Good Morning  " + name);

    }
}

