package intecbrussel.Les2;

public class ArifmeticExample {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a/b;
        int mood = a%b;

        System.out.println("Sum of A and B = " + sum);
        System.out.println("Subtraction of A and B =" + sub);
        System.out.println("Multiplication of A and B=" + mul);
        System.out.println("Division of A and B=" + div);
        System.out.println("Modulus of A and B =" + mood);


        //verhoogt met 1
        int inc = ++b;


        //verlaagd met 1 terug naar de startwaarde
        int dec = --b;


        System.out.println("Incrementig B:" + inc);
        System.out.println("Decrementing B:" + dec);
    }
}
