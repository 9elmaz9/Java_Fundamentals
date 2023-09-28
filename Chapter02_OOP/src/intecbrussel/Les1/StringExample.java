package be.intecbrussel.Les1;

import java.util.SortedMap;
import java.util.SplittableRandom;

public class StringExample {

    public static void main(String[] args) {

        /* Method toUpperCase()
        Met de toUpperCase() methode kunnen we op een heel eenvoudige manier de tekst van onze string omzetten
        naar hoofdletters. */
        String name = "elmaz";
        System.out.println(name.toUpperCase());
        //ELMAZ




        /*Method toLowerCase()
        Naast toUpperCase() hebben we uiteraard ook de toLowerCase case methode.*/
        String name2 = "ELMAZ";
        System.out.println(name.toLowerCase());
       //elmaz



        /* Method lenght()
        Met de length() methode kunnen we de lengte van een string opvragen, hou er rekening mee dat
        spaties ook meetellen.*/
        String str = "hello world";
        System.out.println(str.length());
        //11


        /* Method isBlank() De isBlank() methode zal ons een true teruggeven wanneer
        de string leeg is of enkel spaties bevat.
        -True */
        String str1 = "";
        System.out.println(str.isBlank());
        //false



        /*Methid replece()
        Met de replace() methode kunnen we specifieke characters gaan vervangen met een ander character.*/
        String str2 = " hello world!";
        System.out.println(str.replace('e','a'));
        //hallo world


        //Wanneer het character meerdere keren voorkomt in de string zullen deze allemaal  vervangen worden
        String str3="hello world!";
        System.out.println(str3.replace('l','L'));
        //heLLo worLd!


        /*Method strip()
        verwijderen alle spaties vooran en achteraan */
        String str4 = " hello world ";
        System.out.println(str.strip());
        //heloo world



        /*Method stripLeading()  kunnen we enkel de spatie - prostir- vooran een stul tekst verdwijderen */
        String str5 = " hello world ";
        System.out.println(str5.stripLeading());
        //hello world



        /* Method stripTrailing()  - kunnen we de spaties achteraan een stuk tekst verdwideren; */
        String str6= " hello world ";
        System.out.println(str6.stripTrailing());
        // hello world




        /* Method indexOf()
            De indexOf() methode kunnen we nagaan op welke plaats een bepaald stukje text staat in de string.
             podschitivaet kol-vo chifra - bykba , probel tozhe chitaet*/
        String str7= " hello world ";
        System.out.println(str7.strip());
        //hello world




        /* Method strip.Leading
        Met de stripLeading() methode kunnen we enkel de spaties vooraan een stuk tekst verwijderen.*/
        String str8= " hello world ";
        System.out.println(str8.stripLeading());
        //hello world


        /* Method stripTrailing()
        Met de stripTrailing() methode kunnen we de spaties achteraan een stuk tekst verwijderen.
         */
        String str9= " hello world ";
        System.out.println(str9.stripTrailing());
        // hello world


        /*Method indexOf()
        De indexOf() methode kunnen we nagaan op welke plaats een bepaald stukje text staat in de string. */
        String str10= " hello world";
        System.out.println(str10.indexOf("world"));
        //7



        /*Method contains()
        Met de contains() methode is het mogelijk om te controleren of een bepaalde stukje
        tekst terugkomt in de strin*/
        String str11=" hello world ";
        System.out.println(str11.contains("world"));
        //true


        /*Method substring()
        De substring() methode maakt het mogelijk om tekst uit de string te halen
         van een bepaalde plaats tot aan een andere plaats.*/
        String str12=" hello world";
        System.out.println(str12.substring(6,9));
        //wo


    }
}
