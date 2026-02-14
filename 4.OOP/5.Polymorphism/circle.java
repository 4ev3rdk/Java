public class circle extends shapes {

    //overridign is determined by method signature match(name,parameter )
    //even without override the method with same mehtod name,parameter,retrun type it is considered as OVEVERRIDEN
//    What does @Override do then?
//    It is only a safety check for you.
//    If you accidentally write:
//    void Area() { }  // capital A
//   Without @Override → no error, becomes new method ❌
//    With @Override → compiler error ✔

    //this will run when circle object is created
      @Override //this is annotation: it overrides parent method
      void area () {
        System.out.println("Area of circle is pi * r * r");
    }
}
