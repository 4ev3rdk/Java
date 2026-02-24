package interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.acc();
        car.start();
        car.stop();
        car.brake();
        int a = car.a;
        System.out.println(car.a);
//        //for default same method name in interfaces we use
//        Brake.super.stop();
//        Engine.super.stop();

        System.out.println("-------------");
        Engine car2 = new Car(); // this will also work
        car2.acc();
        // car2.a; //   but this wont work as we have Engine car2 //compile time error as Ref(Engine) dont have a
        //Engine(Ref) :  WHAT CAN BE ACCESSED
        //Reference type(Engine) decides what you can access (compile-time).
        //Object type(Car) decides what actually runs (runtime).
        System.out.println("-------------");

        CDPlayer cd = new CDPlayer();
        cd.start();
        cd.stop();

        System.out.println("-------------");
        NiceCar car3 = new NiceCar();
        car3.start();

        car3.upgradeEngine();
        car3.start();

        car3.StartMusic();
    }

}
