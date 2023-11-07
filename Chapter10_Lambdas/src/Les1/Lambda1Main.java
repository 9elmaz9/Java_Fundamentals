package Les1;

public class Lambda1Main {
    public static void main(String[] args) {

        Lambda1 ref = (x, y) -> {
            System.out.println("hello " + x + y);
            System.out.println("Have a nice day");
        };
        ref.message("World", '!');
    }
}