import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        //While loop = executes a block of code as long as a it's a cinditions remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter your name : ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
    }
}
