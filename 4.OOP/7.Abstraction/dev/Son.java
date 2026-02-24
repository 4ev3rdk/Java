package dev;



public class Son extends Parent {


    //constructor demo in abstract: working
    public Son(int age) {
        super(age); //if we dont have parent constructor then we can remove this line
        this.age= age;
        System.out.println("Son constructor called Age is" +age);
    }
    @Override
    void career() {
        System.out.println("I want to be Doctor ");
    }

    @Override
    void partner() {
        System.out.println("I love" );
    }

    static void hello() {
        System.out.println("Hello");
    }

//    @Override
//    void normal () {
//        super.normal();
//    }  //this is fine but without this it also runs
}
