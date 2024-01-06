package Lesson2;

public class hw2 {
    public static void main(String[] args) {

        // all = 12
        byte b1 = 0B1100;
        byte b2 = 014;
        byte b3 = 12;
        byte b4 = 0xC;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);


        //all 1300
        short s1 = 0b1010010100;
        short s2 = 02424;
        short s3 = 1300;
        short s4 = 0x514;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


        //all 0
        int i1=0b0;
        int i2=00;
        int i3=0;
        int i4=0x0;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        //all
        long l1=0b0_111_010110_1111001101_0100010101L;
        long l2=0726746425L;
        long l3=123456789L;
        long l4=0x75BCD15L;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        float f1=3.14F;
        float f2=2.7172F;

        System.out.println(f1);
        System.out.println(f2);

    }

}
