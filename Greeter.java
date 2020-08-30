public class Greeter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Greetings, earthling!");
        } else {
            System.out.printf("Greetings, %s\n!",args[0]);
        }
    }
}