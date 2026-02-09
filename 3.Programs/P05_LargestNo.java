//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class P05_LargestNo {
    public static void main (String [] main) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= s.nextInt();
        System.out.println("Enter second number: ");
        int b= s.nextInt();

        if(a>b) {
            System.out.println("Largest number is :"+a);
        }
        else {
            System.out.println("Largest number is :"+b);
        }
    }
}
