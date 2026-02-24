package staticInterface;

public interface A {
    //static method in interface must always have body and they cant be empty
    //call via the interface name A.greeting () in Main
    static void greeting(){
        System.out.println("hello Im static method ");
    }
}

