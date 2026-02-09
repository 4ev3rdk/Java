import java.util.Scanner;

public class P01_EvenOdd {
    public static void main(String[] args) {
        int a;
        do {
            System.out.println("Enter the number: ");
            Scanner sc = new Scanner(System.in);
             a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println(a + " is even number");
            } else {
                System.out.println(a + "is odd number");
            }
        } while(a!=0);
}
    }