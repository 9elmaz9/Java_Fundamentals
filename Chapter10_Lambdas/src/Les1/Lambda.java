package Les1;

public class Lambda {
    public static void main(String[] args) {

        //lambda expression to implement above
        //functional interface.This interface
        //by default implements abstractFunction()

        LambdaInterface expression = (int x) -> System.out.println(2 * x); // 10

        //This calls above lambda expression and prints 2 times our print
        expression.abstractFunction(5);   //voor gebruik interface nodig en 1 abstract ()
    }
}
