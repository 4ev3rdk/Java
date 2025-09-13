import java.util.Arrays;
import java.util.Scanner;

public class A01_Array_Input {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        //1.array of primitives
        int [] arr = new int [5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println(arr[0]);


//        for(int i =0 ; i<5; i++) {
//            arr[i]=in.nextInt();
//        }
//        //1.print using for loop
//        for(int i =0 ; i<5; i++) {
//            System.out.println(arr[i]);
//        }

//        //2. print using for each loop
//        for (int num : arr) {  //for every element(num) in the arr
//            System.out.println(num + " "); //print the num(every element)
//        }

//          // 3.print using toString function(Arrays class)
//        System.out.println(Arrays.toString(arr));


        //Array of Objects
        String [] arrr= new String [4];
        arrr[0]= "dev";
        arrr[1]="rishita";
        arrr[2]= "lalit";
        arrr[3] = "sourav";


          //  System.out.println(Arrays.toString(arrr));
        for(int i = 0 ; i<arrr.length ; i++) {
            arrr[i] = in.next();
        }
        for(String name : arrr) {
            System.out.println(name + " ");
        }


    }
}
