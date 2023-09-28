package be.intecbrussel.Les2;

public class ToStringExample {

    //Methode toString()
    //De toString() methode heeft ons een String terug met de
    //inhoud van ons stringBuilder object.

    //method toString()
    //The toString() method returns us a String with the
    //contents of our stringBuilder obje

    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello world!");
        String txt=str.toString();
        System.out.println(txt);
    }
}
