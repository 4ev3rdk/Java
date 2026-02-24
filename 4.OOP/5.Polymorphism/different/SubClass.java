//access modifier

package different;

import Access.A;

public class SubClass extends A {

    SubClass(int num, String name) {
        super(num,name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass (1, "dev");
        System.out.println(obj.num); //protected accessed in ONLY Subclass(different pkg)
        System.out.println(obj.getNum()); //we can access private this wy in subclass

//        A objj = new A (2,"okdev");
//        System.out.println(objj.num); //here protected wont work because its not Subclass(we need Only SubClass) simple
        //because A dont know the child classes
        //if this hold true so no diff in public and protected
        //so only subclass can access in different packages of Protectd variable


        //instance of
        System.out.println(obj instanceof A);
    }
}

class SubSubClass extends SubClass {
    SubSubClass(int num, String name) {
        super(num, name);

    }

    public static void main(String[] args) {
        SubSubClass objjj = new SubSubClass(90, "ninty");
        System.out.println(objjj.num);

        System.out.println(objjj instanceof A); ///true
    }
}