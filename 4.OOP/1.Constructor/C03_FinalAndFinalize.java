public class C03_FinalAndFinalize {
    public static void main(String[] args) {
       final Student s = new Student();
        s.name="rishita";

      System.out.println(s.name);


        for(int i =0; i<100000000; i++){

          //  s = new Student(); //final means you cannot reassign s
                               //  So the loop line trying to give s a new object stops compilation
        }

        Student s2;
        for(int i =0; i<100000000; i++){

            s2 = new Student(); //new object is created and old will lose its reference and gets destroyed
        }                       //garbage collectoor destroy and call finalize
    }
}

class Student {
     String name="dev";

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is getting destroyed");
    }
}
