import java.util.Scanner;

public class P09_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first n numbers:");
        int n = s.nextInt();


        for (int i = 1; i <= n; i++) { //for first n numbers armstrong or not


            int sum = 0;
            int count = 0;
            int temp = i; //write no for one number

            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
            //  System.out.println(count);

            temp = i;
            while (temp > 0) {
                int power = 1;
                int last = temp % 10; //remove last digit

                for (int j = 0; j < count; j++) {
                    power = power * last;
                }
                sum = sum + power;
                temp = temp / 10; //deletes last digit

            }
            //  System.out.println(sum);


            if (sum == i) {
                System.out.println(i + "armstrong");
            } else {
                System.out.println(i + "not armstrong");
            }
        }
    }
}
