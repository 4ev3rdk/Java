package staticInterface;

public class Main implements  A,B{


    @Override
    public void fun() {

    }

    public static void main(String[] args) {
        Main obj = new Main();

        A.greeting(); //static methods are called by interface(here)
    }
}
