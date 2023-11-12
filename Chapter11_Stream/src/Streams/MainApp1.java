package Streams;

import java.util.List;

public class MainApp1 {
    public static void main(String[] args) {
        // Een voorbeeldlijst met tekenreeksen maken
        List<String> strings =List.of("aardbei","pompelmoes","apple","avocado","asperge");

        //Maak een exemplaar van de klasse Opdracht1
        Opdracht1 opdracht1= new Opdracht1();

        //Method1
        System.out.println("Method1: "+opdracht1.toUpperCase(strings));

        //Method2
        System.out.println("Method2: "+opdracht1.filterA(strings));

        //Method3
        System.out.println("Method3: "+opdracht1.filterB(strings));

        //Method4
        System.out.println("Method4: "+opdracht1.filterC(strings));

        //Method5
        System.out.println("Method5: "+opdracht1.filterD(strings));

        //Method6
        System.out.println("Method6: "+opdracht1.filterE(strings));

        //Method7
        System.out.println("Method7: "+opdracht1.filterF(strings));

        //Method8
        System.out.println("Method8: "+opdracht1.filterG(strings));

        //Method9
        System.out.println("Method9: "+opdracht1.filterH(strings));

        //Method10
        System.out.println("Method10: "+opdracht1.filterI(strings));






    }
}
