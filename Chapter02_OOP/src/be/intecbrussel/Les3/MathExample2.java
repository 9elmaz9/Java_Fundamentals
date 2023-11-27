package be.intecbrussel.Les3;

public class MathExample2 {

    public static void main(String[] args) {


        /*  Methode max()
        Met de max() functie kunnen we nagaan welk getal het grootste is van
        twee getallen.De nummers kunnen van de volgende types zijn: int, long, double en float. */

        int result01=Math.max(10,9); // 10
        double result02=Math.max(10.3 , 9.6); //10.3
        long result03=Math.max(17L,8L); //17
        float result04=Math.max(8F,30.5F); //30.5


        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);


        System.out.println(Math.max(3L,6.5));

        System.out.println(Math.max(10L,11.5D));



        /*Methode min()
         De min() functie doet net het omgekeerde van de max functie, deze zal het
         kleinste getal teruggeven. Net zoals de max functie kan je de volgende
         datatypes gan gebruiken: int, long, double, float.*/

        int result1=Math.min(7,9);
        double result2=Math.min(1.3,0.6);
        long result3=Math.min(12L,18L);
        float result4=Math.min(71.5F,30.5F);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        /*Ook bij deze functie kan je verschillende datatypes combineren.
      // Welke van de 2 getallen is het kleinste. 30L (L staat voor long) 12.5F (F staat
         voor float)
         System.out.println(Math.min(30L, 12.5F));
     //  Welke van de 2 getallen is het kleinste. 100L (L staat voor long) 101.9D
         (D staat voor double)
        System.out.println(Math.min(100L, 101.9D))*/







    }
}
