import Access.A;

public class PMain {
   static void add(int a , String b) {

    }
    static void add( String b, int a ) { //order of type is dffiernt so this its method overloading
    }
    static int add(int a, int b) {
       return a +b;

    }


    public static void main(String[] args) {

       shapes s = new shapes();
        s.area();

        circle c = new circle();
        c.area();


        //as learned earlier parent type refernce access method exist in parent class
        //but here parent method is overriden so child method will execute
        //this is allowed because area method exists in parent class
        shapes cir = new circle();//for overriden method java uses object(circle)type, not ref type(cir) of shapes

        cir.area();




        //access modfier test
        A a = new A(4,"dk");
        a.getNum();
        System.out.println(a.getNum());
//       int b = a.num;
    }
}
