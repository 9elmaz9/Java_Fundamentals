package Lesson3;

public class Test5 {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;


        //a=a+13;
        a += 10;
        System.out.println(a);


        //b=b-2;
        b -= 2;
        System.out.println(b);

        // b*=2;
        // b/=2;


        // b+=1; same b++;


        //множественное присвоение

        int a1 = 3;
        int b1 = 50;
        int c1 = 0;

        a1 = b1 = c1 = 18;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);

        long a2 = 100L;
        // int b2=a2; error   , in int cant have all value long

        //int b=10;
        //short s2=b;

        int b2=10;
        a2=b2;  // a =10 now
        System.out.println(a2);


        long a3=100L;

        int b3=10;
        short s= 50;

        long d=s;

        float f1=3.14F;
        double d1=f1;

        double d2=1.23;
      //  float f2=d2; error . float has not enough spase:plase
        float f2=a2; // long - become a float


    }
}

