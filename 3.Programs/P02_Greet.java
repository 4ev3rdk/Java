//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class P02_Greet {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Name : ");
// //string is a class and reference data type in java and its similiar to Scanner class above
// we can write below as ***String a = new String(s.next());***
       // String a = s.next();
        String a = new String(s.next()); // like here string is class and a is ref pts tp object and s.next() return string
        System.out.println("Hello "+a);
        double b = 10;

        //we can use printf in java this is FORMATTED OUTPUT  with specifiers for better alignment
        System.out.printf("value is %.2f",b); //precision upto 2 pts
        //or else complex
        System.out.println(Math.round(b*100.0)/100.0);
        System.out.println("value is " +b);

    }

}
