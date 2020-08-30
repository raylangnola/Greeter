public class Greeter {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.printf("Greetings, %s\n!",args[0]);
        } else {
            System.out.println("Greetings, planetary inhabitant!");
        }
    }
}