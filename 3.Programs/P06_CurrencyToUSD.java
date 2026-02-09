//input currency in rupees and output in USD.

import java.util.Scanner;

public class P06_CurrencyToUSD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Curency in INR :");
        double a = s.nextDouble();
        a=a/90;
        System.out.println("USD is %.2f:" + a);
    }
}
