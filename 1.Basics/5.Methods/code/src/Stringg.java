import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Stringg {
    public static void main(String[] args) {
        String message1 = greet("Dev");
        System.out.println(message1);
    }

    static String greet(String something) {
        String message = "Hello" + something;
        return message;
    }
}
