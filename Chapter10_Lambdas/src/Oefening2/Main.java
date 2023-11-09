package Oefening2;

import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        //lambda expression to calculate and display the factorial of a number
        FactorialCalculator factorialCalculator= num ->{ long factorial = LongStream.rangeClosed(1 , num)
                .reduce(1,(x,y) -> x* y);
            System.out.println(factorial);
        };

        //vb
        int num= 5 ;
        factorialCalculator.caclulateFactorial(num);
    }
}
