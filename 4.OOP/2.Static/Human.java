
public class Human {
    int age ;
    String name;
    static long population;

    static void message () {
        System.out.println("hii");
        // System.out.println(this.age); //we cannot use this inside static
    }

    public Human(int age, String name){
        this.age= age;
        this.name=name;
        //  this.population=population+=1; //this will work but dont do like this
        Human.population = population+=1;  //static is not related to obj(dev) its common to all Human(class)

        this.message();
        Human.message();
    }
}
