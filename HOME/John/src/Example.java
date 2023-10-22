public class Example {

    public static void main(String[] args) {


        int myInt = 7;
        double shoeSize = 9.5;
        char MyInitial = 'J';

        String myName = "Jonh";
        myName.length();


        burp();//создан тут что бы можно было использовать его в  private static void burp(){



        double result = myInt * shoeSize;
        System.out.println(myInt * shoeSize);
        System.out.println(myName.length());


    }

    private static void burp() {  //не будет работать если не будет закатан в выше  public static void main(String[] args) {

        System.out.println("Buuuurppp");
    }

}


