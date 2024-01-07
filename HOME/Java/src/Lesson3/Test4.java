package Lesson3;

public class Test4 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c = a + b;
        //+
        System.out.println(c);
        System.out.println(a + b);


        //int c=b-a;
        //-
        System.out.println(b - a);

        //int c=a*b
        //*
        System.out.println(a * b);

        // /decimal
        int a1 = 10;
        int b1 = 3;

        int c1 = a / b;
        //System.out.println(a/b);
        System.out.println(c1);  //=3

        double a2 = 11;
        double b2 = 3;
        double c2 = a2 / b2;
        System.out.println(c2);  //3.6666666666666665

        System.out.println(a2 / b2);

        // %
        int e = 11;
        int y = 3;
        int celayaChast = e / y;
        int ostatok = e % y;
        //System.out.println(e/y);
        System.out.println(celayaChast);
        System.out.println(ostatok); // 3 + 3  + 3 = ostatok 2  ot 11

        double q = 5.5;
        double w = 3.5;
        double p = q % w;
        System.out.println(p); // 2.0


        // ++
        int x5 = 5;
        int y5 = 3;

        int z5 = x5 - y5;

       // int z6 = x5 - y5++; // +1  after  5- (3+1 after )=2 , but y5=4;

        int z8 = x5 - ++y5;// +1 before ,  5- (1+3)= 1

        System.out.println(z5);
        //System.out.println(z6);
        System.out.println(y5);

        System.out.println(z8);
        System.out.println(y5);


    }
}
