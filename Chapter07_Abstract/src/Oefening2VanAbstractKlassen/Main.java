package Oefening2VanAbstractKlassen;
// point of departure
public class Main {

    public static void main(String[] args) {
        //  CREATE OBJECT
        // create instance  of each planeten = create object
        Zon zon = new Zon();
        Aarde aarde = new Aarde();
        Maan maan = new Maan();



        //Set parametrs
        //Calculate and display area  for each shape
        //Рассчитываем и отображаем площадь для каждой фигуры
        double zonRadius = 696340; // km // zadaem parametry Radiusa
        double aardeRadius = 6371;
        double maanRadius = 1737.5;


        // Calculate and display the perimeter for each planeten body
        System.out.println("Perimeter of " + maan.NAME + "  " + maan.CALCULATEPERIMETER(maanRadius) + "km");
        System.out.println("Perimeter of " + zon.NAME+ "  " + zon.CALCULATEPERIMETER(zonRadius)+ " km");
        System.out.println("Perimeter of "+ aarde.NAME+ "  " + aarde.CALCULATEPERIMETER(aardeRadius)+"km ");

    }
}
