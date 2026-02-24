package dev;

public class Main {

    public static void main(String[] args) {
        Son s1 = new Son(1);

        s1.career();

        //we cant create object of abstract class
        //parent her is abstract and cant be instantiated (it will look for abstract methods which are empty)
         // Parent s3 = new Parent(1) {    ❌

        //it asks us to do this(to intiate using override)
//            @Override
//            void career() {
//                System.out.println("i want to be cricketer");
//            }
//
//            @Override
//            void partner() {
//
//            }
//        };
   //     s3.career();


        Parent.hello(); //calling static method
        Son.hello();   //Calling static method(son)

         s1.normal(); // we cant access using Parent.normal or son.normal ( because normal is non static and we need objects)
    }
}
