package be.intecbrussel.Les4;

//Dit zijn voorbeelden als we de == gebruiken op een
//object
public class EqualsExample2 {

    public static void main(String[] args) {


        String str01 = "Hello Intec";
        String str02 = new String("Hello Intec");
        String str03 = str02;


        // ETO VARIANT 1
        // False doordat we 2 objecten vergelijken met andere referentiepunten
        boolean equal01 = (str01 == str03); // kijken we referance type
        // True doordat we hier 2 variabelen vergelijken die naar hetzelfde object wijzen.
        boolean equal02 = (str02 == str03);
        System.out.println(equal01); //false
        System.out.println(equal02); //true

       // ETO VARIANT 2 -alle true
        System.out.println(str01.equals(str02));
        System.out.println(str01.equals(str03));
        System.out.println(str02.equals(str03));


    }
}