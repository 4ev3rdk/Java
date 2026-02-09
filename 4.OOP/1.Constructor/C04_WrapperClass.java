package 1.Constructor;
public class C04_WrapperClass {
    public static void main(String[] args) {


//        int a = 10;
//        int b = 20;
        //even if Integer passes reference value it cant swap because Integer class is FINAL
        Integer a=10;
        Integer b=20;
        swap(a,b);
        System.out.println("Value of a after swap method : "+a);
        System.out.println("Value of b after swap method : "+b);
    }
    static void swap(Integer a , Integer b){
        Integer temp=a;
         a=b;
         b =temp;
        System.out.println("value of a :"+a);
        System.out.println("value of b :"+b);
    }
}
