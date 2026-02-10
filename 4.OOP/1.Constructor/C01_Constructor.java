public class C01_Constructor {


    public static void main(String[] args) {


        class Student {
            int rno=13;
            String name;
            float marks;
             
            //constructor
            Student() {   //explicit constructor replaces default
                this.rno=15;
                this.name="dev";
                this.marks=90;
            }

            Student (int roll, String name, float marks){  //constructor overloading
                this.rno=roll;
                this.name=name;
                this.marks=marks;
            }
            void changeName(String name){
                this.name= name;
            }

            //if constructor takes an object of same class and copies data
            //its called copy constructor
            Student (Student ss){
                this.rno=ss.rno;
                this.name=ss.name;
            }


        }

        //this is default constructor and values are outside
     //    Student s= new Student();
      //  s.name=101;


        Student s = new Student(108, "Dev Suthar", 100);
        Student random = new Student ();
         //  Student s2= new Student(109, "Prem", 99);
        //here this = s2;

       // s.name="dev";
        // s.changeName("rishita");

        System.out.println(s.rno);
        System.out.println(s.name);
        System.out.println(s.marks);

        Student s1= new Student(s);
        System.out.println(s1.rno);
        System.out.println(s1.name);

        System.out.println(s1); //some random value s1.toString wrote properly in 2.static/Innerclass
    }
}
