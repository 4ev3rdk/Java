public class Singleton {
    private Singleton () {  //constructor is private so object cannot be created from outside
        //so we create the object from Singleton class because we can access private inside same class

    }
    String name;
    private static Singleton instance; //here instance is reference variable

    public static  Singleton getInstance() { //other classes can use this method to create object
        if(instance==null) {
            instance = new Singleton(); //create an object if reference variable is null
        }
        return instance;
    }

}
