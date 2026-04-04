package eh;

//creating custom Exception
public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}
//MyException("Name is Dev")
//       ↓
//               super("Name is Dev")
//               ↓
//Exception class stores the message