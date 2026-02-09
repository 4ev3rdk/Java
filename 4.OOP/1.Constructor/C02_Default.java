
    class Base {
        Base() {
            System.out.println("superclass default constructor is called");
        }
    }
    class Derived extends Base {
        Derived () {
        System.out.println("Derived constructor is called");
    }
    }
    public class C02_Default {
    public static void main(String [] args) {

        Derived d = new Derived ();

    }
}
