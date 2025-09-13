import java.util.Scanner;

public class J02_Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int a = input.nextInt();
      //  isprime(a);
        System.out.println(isprime(a));
    }
    static boolean isprime(int b) {
        if(b<=1) {
            return false;
        }
            for(int i = 2; i * i <= b; i++) {
                if (b % i == 0) {
                    return false;
                }
            }
            return true;
        }


}
