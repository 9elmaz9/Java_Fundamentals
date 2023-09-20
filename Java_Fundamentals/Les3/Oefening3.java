package be.intecbrussel.Les3;

public class Oefening3 {

    public static void main(String[] args) {

        byte a = 10;
        int b = 5;
        long c = 5;

        boolean equal = (b == c);
        boolean notEqual = (a != b);
        boolean biggerThan = (a > c);
        boolean smallerThan = (b < a);
        boolean biggerEqual = (a >= b);
        boolean smallerEqual = (c <= a);

        System.out.println("a <b:" + (a < b));
        System.out.println("a != c:" + (a + b));
        System.out.println("a> c:" + (a + c));
        System.out.println("b< a:" + (b + a));
        System.out.println("a>=b:" + (a + b));
        System.out.println("c<=a:" + (c + a));
    }
}
