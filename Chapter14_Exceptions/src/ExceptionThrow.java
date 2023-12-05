public class ExceptionThrow {
    public static void main(String[] args) {

        ageCheck(20);      //10- U kunt stemmen
    }

    public static void ageCheck(Integer num) throws ArithmeticException, NumberFormatException {
        //    public static void ageCheck(Integer num) throws ArithmeticException{

        if (num > 18) {
            //gooie exception met java throw keyword
            throw new ArithmeticException("U mag niet stemmen");
        } else {
            System.out.println("U kunt stemmen");
        }
    }
}

