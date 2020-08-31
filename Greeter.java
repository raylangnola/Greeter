import java.util.*;

public class Greeter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Greetings, earthling!");
        } else {
            StringBuilder sb = new StringBuilder("Greetings");
            for(int ndx = 0; ndx < args.length - 1; ndx++) {
                sb.append(String.format(", %s", args[ndx]));
            }
            if (args.length > 1)
                sb.append(", and");
            sb.append(String.format(" %s!",args[args.length-1]));
            System.out.println(sb.toString());
        }
    }
}