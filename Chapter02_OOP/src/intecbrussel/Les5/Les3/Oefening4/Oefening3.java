package be.intecbrussel.Les5.Les3.Oefening4;

public class Oefening3 {
    public static void main(String[] args) {

        /*Oefening 3
Maak een applicatie die een random getal genereert tussen 0 en 60 met
v, rond deze naar boven af en controleer of dit getal even of
oneven is.
Voor deze oefening heb je een operator nodig uit hoofdstuk basis
programmeren operators*/

        //random getal genereert tussen 0 en 60
        double result = (Math.random() * 60);
        System.out.println(result);

        double result2 = Math.round(result);
        System.out.println(result2);


        if (result2 % 2 == 0) {
            System.out.println("the generated" + result2 +"are even");
        } else {
            System.out.println("the generated" + result2 + "are not even");

        }
    }
}
