public class ExceptionExample {
    public static void main(String[] args) {

        int a = 10;

        //int b = 0; //Het getal kan niet door nul worden gedeeld.//Finally blok werkt.// Code werkt

        int b = 2; //5 //Finally blok werkt.//Code werkt

        int c;

        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException exception) { // Als een probleem hebt, kom dan eerst hier
            System.out.println("Het getal kan niet door nul worden gedeeld.");
        } finally {
            System.out.println("Finally blok werkt."); // if werkt - komt onmiddellijk hier
        }
        System.out.println("Code werkt");
    }
}

