import java.util.Scanner;

public class J01_PalindromeOrNot {

    public static boolean palindrome(int a) {
         int temp =a;
        int reverse =0;
        while(temp>0) {
            int last = temp%10;
            reverse = reverse * 10 + last;
            temp= temp/10;
        }
        if(a<0) {
          return -reverse == a;
        }

            return reverse ==a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        palindrome(num);
        if(palindrome(num)) {
            System.out.println(num + " is palindrome");
        }
        else {
            System.out.println(num + " is not palindrome");

        }
    }

}
