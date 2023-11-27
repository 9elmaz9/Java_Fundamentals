package intecbrussel.Les5;

public class BreakWhileLoop {
    public static void main(String[] args) {
        int index = 0;

        while (index < 10) {

            System.out.println(index);
            index++;

            if (index == 4) { //0123

                break; // The program exits the loop

            }

        }
    }
}
