//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class P07_Fibonacci {
    public static void main(String[] args) {


//        Scanner s = new Scanner(System.in);
//        int a = 0, b = 1;
//        int n = 5;
//
//
//        for(int i =0 ; i<5; i++) {
//            System.out.println(a+ " ");
//            int temp = a + b;
//            a= b;
//            b = temp;
//
//        }
            Scanner s = new Scanner(System.in);
            System.out.println("enter n number to find fibonacci for:");
            int n= s.nextInt();

            int first=0;
            int second=1;
            for(int i=0; i<n; i++) {
                System.out.println(first + " ");
                int temp= first + second;
                first=second;
                second=temp;
            }
    }
}
