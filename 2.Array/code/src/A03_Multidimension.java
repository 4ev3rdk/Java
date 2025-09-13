import java.util.Arrays;
import java.util.Scanner;

public class A03_Multidimension {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][];
        arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};


//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //for each loop
        for (int[] a : arr) {
         //   System.out.println(Arrays.toString(a)); this will print
            for(int elements : a) {
                System.out.print(elements + " ");
            }
            System.out.println();
    }


        int rowSize , colSize;

        System.out.println("Enter the size of row : ");
        rowSize = in.nextInt();

        System.out.println("Enter the size of coloumn : ");
        colSize = in.nextInt();

        int[][] arrr = new int[rowSize][colSize];

        System.out.println("Enter array:");
        for (int row = 0; row < arrr.length; row++) {
            for (int col = 0; col < arrr[row].length; col++) {
                arrr[row][col] = in.nextInt();
            }
        }

//        for (int row = 0; row < arrr.length; row++) {
//            for (int col = 0; col < arrr[row].length; col++) {
//                System.out.print(arrr[row][col] + " ");
//            }
//            System.out.println();
//        }

        for( int row = 0 ; row < arrr.length ; row ++ ) {
            System.out.println(Arrays.toString(arrr[row]));
        }

    }
}
