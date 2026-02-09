//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class P07_Fibonacci {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int a = 0, b = 1;
        int n = 5;


        for(int i =0 ; i<5; i++) {
            System.out.println(a+ " ");
            int temp = a + b;
            a= b;
            b = temp;

        }
//        System.out.println(a+ "\n"+b);
//        for (int i = 0; i < n-2; i++) {
//            int temp = a + b;
//            a = b;
//            b = temp;
//
//            System.out.println(temp + " ");
//        }
    }
}
