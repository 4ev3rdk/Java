
//class Test {   //this class is outside so we dont need it to be static
//    String name;
//
//    public Test(String name) {
//        this.name = name;
//    }
//}
public class InnerClass {  //outer(top) level class dont need to static as it doesnt depend on other class

//    static class Test { // this needs to be static because its inside other class // making it static doesnt need an object of Top level class
//        String name;
//
//        public Test(String name) {
//            this.name = name;
//        }
//    }

    static class Test {
        static String name;  // static name copied to all the objects

        public Test(String name) {
           Test.name = name;
        }

        // adding .toString to run a directly to run sout(a)

//        @Override
//        public String toString() {
//            return name;
//        }

    }


    public static void main(String[] args) {

        Test a = new Test("Dev");
        Test b = new Test("Rish");
        System.out.println(a.name);  //name is non static so it belongs to each object separately
        System.out.println(b.name);
        System.out.println(a); //gives some random value internally its calling a.toString
        //more detail  : public String toString() {
        //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //    }
    }
}
