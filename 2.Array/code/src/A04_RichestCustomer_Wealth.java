import java.util.Arrays;
import java.util.Scanner;

public class A04_RichestCustomer_Wealth {

    public static int maximumWealth(int[][] accounts) {
        int maxwealth = 0;


        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (sum > maxwealth) {
                maxwealth = sum;
            }
        }

        return maxwealth;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter No. of Rows:");
        int m = in.nextInt();
        System.out.println("Enter the No of Coloumns :");
        int n = in.nextInt();
        int[][] accounts = new int[m][n];

        System.out.print("Enter Array elements :");

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                accounts[i][j] = in.nextInt();
            }
        }

        // for (int i = 0; i < accounts.length; i++) {
        // System.out.println(Arrays.toString(accounts[i]));
        // }
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                System.out.print(accounts[i][j] + " ");
            }
            System.out.println();
        }

        int richest = maximumWealth(accounts);
        System.out.println(richest);
        in.close();
    }

}

