
public class Main {
    public static void main(String[] args) {

//        Human Dev = new Human(18,"Dev");
//        Human Rishita = new Human(18,"Rishita");
//        System.out.println("Age :"+Dev.age +" Name: "+Dev.name);
//        System.out.println(Dev.population); //this will work but dont do like this
//        System.out.println(Human.population);
//
//        System.out.println(Rishita.population); //this will work but dont do like this
//        System.out.println(Rishita.population);

//      greeting ();
        fun();
        Main obj = new Main();
        obj.fun2();  //this non static function fun2 is accessed with creating obj of main class

    }

        //static is non dependent on objects
        static void fun () {
            //  greeting (); // this require an instance
            // but the function you using does not depend on object/instances so it will not work

            //you cannot access non static  stuff without referncing their instances in static context
            //here we referenced using instance(obj)

            //*** dont get confuse with to obj with same name of Main(class) both are different here obj is
            //scope  level for method fun()***///

             Main obj = new Main();
            obj.greeting();

    }
    void fun2 (){
        greeting();
    }
    //we need static here because we know non static, belongs to objects
   void greeting (){
        System.out.println("dev saying hiii");
    }
}
