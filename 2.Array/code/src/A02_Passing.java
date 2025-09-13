import java.util.Arrays;

public class A02_Passing {

    public static void main(String[] args) {

        int[] arr = new int[1];
        arr[0]=4;
        System.out.println(Arrays.toString(arr));
        changed(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changed(int [] ar) {
        ar[0] = 8;
    }
}
