package be.intecbrussel.Les4;

public class EqualsExample1 {

    public static void main(String[] args) {

        int a = 10;
        int b=10;
        double c =5.5;
// vergelijken met een vergelijkingsoperator
        boolean equal01=(a==b);
        boolean equal02=(a==c);

        System.out.println(equal01); //true
        System.out.println(equal02); // false



        String s1="intec";
        String s2="intec";
        String s3="INTEC";
        String s4="Java";

        boolean equal03=(s1==s2);
        boolean equal04=(s2==s3);
        boolean equal05=(s3==s4);

        //TRUE omdat alles overeenkomt grote van de letters en het woord
        System.out.println(equal01);
        //FALSE omdat de grootte van de letters niet overeenkomt
        System.out.println(equal02);
        //FALSE  omdat de content niet overeenkom(не совпадает)
        System.out.println(equal03);

    }


}
