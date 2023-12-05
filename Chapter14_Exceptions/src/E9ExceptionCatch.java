public class E9ExceptionCatch {
    public static void main(String[] args) {

        try {
            //int num = Integer.parseInt("1"); //1      / by zero
            int num =Integer.parseInt("Hello"); // For input string: "Hello"
            System.out.println(num);
            int result = 5/0 ;
            System.out.println(result);
        }catch (ArithmeticException | NumberFormatException anException){
            System.out.println(anException.getMessage());
        }
    }
}
