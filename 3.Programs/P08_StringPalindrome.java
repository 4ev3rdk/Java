//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class P08_StringPalindrome {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter string");
        String str = s.next();

      //  str=str.toLowerCase(); // for case-sensitive
        String rev = "";
        //first reverse
        for(int i=str.length()-1; i>=0; i--){
           rev= rev+ str.charAt(i);
        }
        System.out.println(rev);

        //now compare
        if(str.equals(rev)) {
            System.out.println(str+ " is palindrome");
        }
        else {
            System.out.println(str + " is not palindrome");
        }

    }


}
