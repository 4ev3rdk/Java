import java.util.Scanner;

public class J03_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a=input.nextInt();

        switch(a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid day");
        }
    }
}
