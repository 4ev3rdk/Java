import java.sql.SQLOutput;

public class Mainnn {
    public static void main(String[] args) {


        Box box1 = new Box(2,4,6);
        Box box2 = new Box();
     //   System.out.println(box1.l + " "+ box1.h + " " + box1.w); private l wont work outside class


        BoxWeight box3 = new BoxWeight(2,4,6,8);
       System.out.println(box3.h+ " " +box3.weight + " "+ box3.w); //this extended class can access parent class property like her box3.h
     //   System.out.println(box3.l);

        Box box4 = new BoxWeight(); // superclass variable can refernce baseclass (can access only methods from
                                    // superclass
       // System.out.println(box4.w);

        // here you are given access to variable in ref type i.e BoxWeight
        //hence you should have access to weight variable
        //but we should initialises the one we are accessing
        //but here object itself is type of parent class(Box), so you cannto call the constructor
        //superclass Box doesnt know weight property as its top level class (base class knows top level class methods)
//        Boxweight box5 = new Box(5); //here we are refernce a child to parent so it wont work

//        System.out.println(box5);
        BoxPrice box = new BoxPrice(12,6,8);
        System.out.println(box.h); //we cant write box.side because side isnt variable in Box.java



        BoxWeight boxx= new BoxWeight(); //static method can be inherited but cant be overriden
        boxx.greet();
    }
}