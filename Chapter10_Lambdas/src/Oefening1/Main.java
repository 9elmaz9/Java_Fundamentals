package Oefening1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //вывоd четных числе , только четных
        LambdaOperator lambdaOperator = numbers -> {
            Arrays.stream(numbers) //испол поток и лямбда выражение для фильтрации  и вывода четныз чисед
                    .filter(num -> num % 2 == 0)
                    .forEach(System.out::println);
        };
        //vb
        int[] numnersArray={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        lambdaOperator.printEvenNumbers(numnersArray);

    }
}
