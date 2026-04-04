public class P03_SimpleInterest {
    public static void main (String [] args) {
        int p=10000, r=5, t=3;
        int SI = (p*r*t)/100;

               System.out.println("simple interest is : "+ (p*r*t)/100);
            // if time is in months (p*r*t/12)/100

                System.out.println("simple interest is : "+ (p*r*t/12.0)/100);

    }
}

