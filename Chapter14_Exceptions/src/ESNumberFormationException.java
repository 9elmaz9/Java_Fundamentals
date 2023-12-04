public class ESNumberFormationException {

    public static void main(String[] args) {

        int a;

        try {
            a = Integer.parseInt("Hello");
            System.out.println("A is:" + a);

        } catch (NumberFormatException exception) {
            //exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("Exception:"+ exception);  //Code werkt
        }
        System.out.println("Code werkt");

     //simple
     // int a;

     // try {
     //     a = Integer.parseInt("Hello");
     //     System.out.println("A is:" + a);
     // } catch (NumberFormatException exception) { // Als een probleem hebt, kom dan eerst hier
     //     System.out.println("Code werkt");  //Code werkt
     // }
    }

}
