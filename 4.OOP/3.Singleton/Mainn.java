public class Mainn {

    public static void main(String[] args) {


        //both refernce variable are pointing to one object
        //this is not a object its way of calling method from Singleton class
        //just like this : Singleton obj1;
        //                 obj1 = Singleton.getInstance();

        Singleton obj1 = Singleton.getInstance();  //not createing object but getting same object
        Singleton obj2 = Singleton.getInstance();

        obj1.name="dev";
        obj2.name="rish";
        System.out.println(obj1.name); //both obj1 and obj2 points to same object in Singleton object so it will print updated one

    }
}
