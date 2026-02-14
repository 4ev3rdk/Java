public class BoxWeight extends Box{
    double weight;
    BoxWeight() {

        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        //remember if we dont use super here it will call default parent parent constructor (parameters dont matter whatever we type it will call default costructors values)
        //superclass has two forms
        //here sequence matter because first parameter = Box class' first parameter
        super(l, h, w); //1.Calling the parent class constructor (it should be first in constructor body)

        System.out.println("subclass constructor called");

        //   System.out.println(super.h);  //2.The second is used to access a member of the superclass that has been hidden by a member of a subclass.
        //suppose both parent and child have variable x then we use super.x to access parent


        this.weight = weight;
    }
        BoxWeight(BoxWeight other) {
        // calls parent class copy constructor nothing to confuse

          //  Notice that super() is passed an object of type BoxWeight—not of type Box.This still invokes the constructor Box(Box ob).
          //  NOTE: A superclass variable can be used to reference any object derived from that class.
            //  Thus, we are able to pass a BoxWeight object to the Box constructor.Of course,Box only has knowledge of its own members.
            super(other); //here it like this Box box1= new BoxWeight();
            this.h =other.h;



        }
    BoxWeight(double side, double weight) {
        super(side);
        this.weight=weight;
    }

}
