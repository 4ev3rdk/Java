package dev;


//we cant  final this class because that will prevent it from inherited
public abstract class Parent {

    //we can also provide variable to abstract class
    int age;

    //Constructor demo in abstract class: Working
    public Parent(int age) {
        this.age = age;
        System.out.println("Parent constructor called : Age" +age );
    }

    //we cant create abstract constructors

//    abstract parent() {    ❌
//    }

    //we cant create abstract static method as well because static methdods arent overrident
    // abstract static method ()  ❌


    //but we can create static method
    static void hello() {
        System.out.println("Hello");
    }

    //normal method
    void normal () {
        System.out.println("normal method");
    }
    abstract void career();
    abstract void partner();
}

