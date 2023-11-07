package Les1;

public class MainMyInterface {

    public static void main(String[] args) {

        //declare a reference to MyInterface
        //assing a lambda expression to the reference
        MyIntersface ref=(str) -> {
            String result = "";
            for (int i= str.length()-1 ;i>=0; i--)
                result += str.charAt(i);
            return result;
        };

        //call the method of the interface
        System.out.println("Lambda reversed = " +ref.reverse("Lambda"));
    }
}
