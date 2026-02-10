public class StaticBlock {
    static int a = 10;
    static int b;

    //it will only run once
    //used to initilize the static varible when logic is required
    //eg int x=  (int)(Math.random() * 100);
    //it runs before class loads main()
    static {
        System.out.println("static block");
        b= a * 5;
    }

    public static void main(String[] args) {


        StaticBlock obj = new StaticBlock();
        System.out.println(a); //inside same class java automaticallly understand as StaticBlock.a
        System.out.println(StaticBlock.a); //accessing static block using class name    //best practice
        //static members should be accessed using class name
        System.out.println(obj.a); // this works but not recommended
        System.out.println(a + " " + b);
        StaticBlock.b+=3;
        System.out.println(a + " " + b);

    }
}
