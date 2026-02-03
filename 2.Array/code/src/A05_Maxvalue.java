import java.util.Arrays;


public class A05_Maxvalue {
    public static void main(String[] args) {
        int [] arr = {34,5,2,67,3};
            System.out.println(Arrays.toString(arr));
        maxValue(arr);
        System.out.println(maxValue(arr));
    }
    static int maxValue(int [] arrr) {
        int max = arrr[0];
        for(int i = 0; i<arrr.length; i++) {
            if(max<arrr[i]){
                max=arrr[i];
            }
        }
      return max;
    }
}
