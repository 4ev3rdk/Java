import java.util.Scanner;

public class P02_Greet {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Name : ");
// //string is a class and reference data type in java and its similiar to Scanner class above
// we can write below as ***String a = new String(s.next());***
       // String a = s.next();
        String a = new String(s.next()); // like here string is class and a is object and s.next() holds value to give to string object here(a)
        System.out.println("Hello "+a);
        double b = 10;
        System.out.printf("value is %f",b);

    }
}
