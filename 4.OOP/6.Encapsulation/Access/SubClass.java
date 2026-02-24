package Access;

public class SubClass extends A{

    SubClass(int num, String name) {
        super(num,name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass (1, "dev");
        System.out.println(obj.num); //protected/default/public accessed in Subclass(same pkg)
        System.out.println(obj.getNum()); //we can access private this wy in subclass

        A objj = new A(2, "d");
        System.out.println(objj.num);
    }
}
