package be.intecbrussel.Les4;

public class EqualsExample3 {

    public static void main(String[] args) {

        String s1= new String("Hello");
        String s2= new String("Hello");

        System.out.println("s1 and s2 are equal:" +(s1==s2)); // not true - FALSE ,  twee verschillende object
        System.out.println("s1 and s2 are equal:" +(s1.equals(s2))); // tyt sravnivautsa danie v skobkax

        s1=s2; // tyt s1 naznachuli s2  i s1 stalo s2 / s2 heeft nu dezelfde referansie als s1 /
        // s2 теперь имеет ту же ссылку, что и s1

        System.out.println("s1 and s2 are equal:" + (s1==s2)); // tyt ravno , bo teper ony odinakovie


    }
}
