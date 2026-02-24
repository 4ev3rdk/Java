package Access;

public class Main {
    public static void main(String[] args) {

        A obj = new A(10, "dev");

        //To access Private variable use
        System.out.println(obj.getNum());


        //default allow in same package
//        System.out.println(obj.num);
    }
}
