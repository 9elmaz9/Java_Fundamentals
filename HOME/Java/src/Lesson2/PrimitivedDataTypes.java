package Lesson2;

public class PrimitivedDataTypes {
    public static void main(String[] args) {

        //тип данных + имя переменной= значение переменной
        //  byte - 8 bit
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 100;


        short s1 = 5;
        short s2 = -10;
        short s3 = 0;


        //default
        int i1 = 5;

        long l1 = 1000;
        long l2 = 10000000000L;// better L
        long l3 = 1000000000L;


        float f1 = 3.14F;
        float f2 = 3.14f;
        float f3 = 20;
        float f4 = 20.0f;


        double d1 = 5.5D;
        double d2 = 87.65d;
        double d3 = 87.65;


        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        //char c4="a"; spase is symbol too
        char c5 = ' ';

        char c6 = 300; //трехсотый символ в юникоде   //Ĭ   10 десятиричная система исчисления
        char c7 = '\u1234';   //ሴ   // 16 шестнадцатеричная система исчисления


        char c8 = 500; //пятисотый символ в юникоде . 10 десятиричная система исчисления   // 1280= 500  in 16
        char c9 = '\u0500';  // 16 шестнадцатеричная система исчисления   ABCDEF
        System.out.println();

        boolean bool1 = true;
        boolean bool2 = false;


        //number system
        //Системы исчислений
        int A1 = 60; // decemal  десятеричная
        int A2 = 0B111100;  //0b111100; binary двоичная
        int A3 = 074; //  8  octal восьмеричная

        int A4 = 0x3C;   // 16  hexadecimaal шестнадцатеричная
        int A5 = 0X3c;  // same A4

        //60
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
        System.out.println(A4);


        System.out.println(b1);
        System.out.println(c2);
        System.out.println(c8);
        System.out.println(c9);
        System.out.println(bool1);
        System.out.println(bool2);


        int A7 = 1_000_000_0_0_0;
        System.out.println(A7); //1000000000

        float f9 = 4_5.5F;


    }
}
