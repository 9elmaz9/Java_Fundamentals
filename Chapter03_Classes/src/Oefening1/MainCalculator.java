package Oefening1;

import java.awt.*;

public class MainCalculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int smallest = calculator.findSmallestNumber(9, 6, 3);
        System.out.println("Het kleinste nummer is: " + smallest);

        int grootste = calculator.findGrootsteNumber(9, 6, 3);
        System.out.println("Het grootste  nummer is: " + grootste);

        int sum = calculator.add(6, 3);
        System.out.println("De som is: " + sum);

        int sub = Calculator.sub(6, 3);
        System.out.println("Het sub is: " + sub);

        int mul = calculator.multiply(6, 3);
        System.out.println("Het mul is: " + mul);

        int div = calculator.multiply(6, 3);
        System.out.println("Het div is: " + div);

        int modulus = calculator.modulus(6, 3);
        System.out.println("Het mood is: " + modulus);


   boolean areDigitsEven1=Calculator.areAllDigitsEven(8642);
   boolean areDigitsEven2=Calculator.areAllDigitsEven(963);
   boolean areDigitsEven3=Calculator.areAllDigitsEven(600);
   boolean areDigitsEven4=Calculator.areAllDigitsEven(999);
   System.out.println("Zijn alle cifers even in 8642?"+areDigitsEven1);
   System.out.println("Zijn alle cifers even in 963?"+areDigitsEven2);
   System.out.println("Zijn alle cifers even in 600?"+areDigitsEven3);
   System.out.println("Zijn alle cifers even in 999?"+areDigitsEven4);

    }
}

