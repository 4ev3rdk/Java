package com.dev;

import java.util.Scanner;

public class J08_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s= input.next();
        boolean ispal = true;

        int i=0 ; int j=s.length()-1;
        while(i<j) {
            if (s.charAt(i) != s.charAt(j)) {

                ispal = false;
            break;
        }
            i++;
            j--;

        }
        if(ispal) {
            System.out.println(s+ "is palinddrome");
        }
        else{
            System.out.println(s+ " is not palindrome");
        }


    }
}
