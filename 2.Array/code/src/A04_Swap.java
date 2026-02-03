import java.util.Arrays;

public class A04_Swap {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for(int i = 0 ; i<arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();   
        reverse(arr);
        System.out.println(Arrays.toString(arr));
      swap( arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap ( int  []arrr , int a , int b) {
        int temp = arrr[a];
        arrr[a] = arrr[b];
        arrr[b] = temp;
    }
    static void reverse(int [] arrr) {
          int start = 0;
          int end = arrr.length-1;
        while(start<end) {
          swap(arrr,start,end);
            start ++;
            end --;
        }

    }
}
