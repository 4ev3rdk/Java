public class Basic {
    //enum can implement interface
    enum Week implements A{
            Mon,Tue,Wed,Thur,Fri,Sat,Sun;
        //this are enum constants
        //they are public,static and final
        //as they are final we cannot create its child  enum
        //type is Week here
        Week() {
            System.out.println("Constructor called" + this);
            //this is private or default
            //we dont want to create new objects
            //  this is not enum concept that why
        }
            //here we are implementing A
         @Override
                 public void hello(){
                System.out.println("helloo dev here");
            }
        }


    public static void main(String[] args) {
        Week day;
        day=Week.Mon;
//        for(Week dayy : Week.values()) {
//            System.out.println(dayy);
//        }
        System.out.println(day);
        System.out.println(day.ordinal());// position of enum constant


        day.hello();
    }
}
