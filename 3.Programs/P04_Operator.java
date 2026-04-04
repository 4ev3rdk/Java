
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;
public class P04_Operator {
//    public static void main (String [] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter first Number : ");
//        int a= s.nextInt();
//        System.out.println("Enter Second Number : ");
//        int b = s.nextInt();
//
//        System.out.println("Enter Operator : ");
//        char c = s.next().charAt(0);  //next return string so we take first character
//        if(c=='+') {     // if we take c as string then c.equals("+")
//            System.out.println(a + b);
//        }
//            else if (c=='-') {
//            System.out.println(a - b);
//        }
//               else if (c=='*') {
//                System.out.println(a * b);
//        }
//        else if (c=='/') {
//            System.out.println(a / b);
//        }
//        else {
//            System.out.println("Enter valid operator");
//        }


//}


    public static void main(String[] args) {

char operator;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Enter first no: ");
            int a = s.nextInt();

            System.out.println("Enter second no: ");
            int b = s.nextInt();


            System.out.println("Enter a operator :");
            operator = s.next().charAt(0);

            if (operator == '+') {
                System.out.println(a + b);
            } else if (operator == '-') {
                System.out.println(a - b);
            } else if (operator == '*') {
                System.out.println(a * b);
            } else if (operator == '/') {
                System.out.println(a / b);
            }
            else
            {
                System.out.println("enter valid operator");
            }
        }
        while(operator!= 'x');  //here if x is typed condtion becms false andloop stops

    }
}
