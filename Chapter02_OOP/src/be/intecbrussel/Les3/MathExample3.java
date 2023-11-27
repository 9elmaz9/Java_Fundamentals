package be.intecbrussel.Les3;

public class MathExample3 {


    //Methode ceil()
    // De ceil() functie zal het komma getal double afronden naar boven.

    public static void main(String[] args) {

        double result = Math.ceil(4.1); //5
        System.out.println(result);
        //5.0


        //Methode floor()
        //Met de floor() functie kunnen we een komma getal double afronden naar beneden.
        double result2 = Math.floor(10.9); //10
        System.out.println(result2);
        //10.0



        /*Methode random()
        Random() is een functie van de math class die een komma getal terug zal
        geven tussen 0 en 1. Telkens wanneer we de functie uitvoeren krijgen we
        een andere waarde*/

        double result3 =Math.random();
        System.out.println(result3);

        //Wanneer we de waarde vermenigvuldigen met 10 kunnen we een
        //willekeurig komma getal genereren tussen 0 en 10.
        double result4 =Math.random()*10;
        System.out.println(result4);



        /*Methode pow()
        Deze functie wordt gebruikt om een getalverhoging tot de macht van een
        ander getal te berekenen = vozvodit v kvadrat 2*2*2=8*/
        double result5 =Math.pow(2,3);
        System.out.println(result5);
        //8.0












    }


}

