package Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {


        //Een Map maken en elementen toevoegen
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        //Een element opzoeken en de waarde afdrukken
        int ageOfAlice = map.get("Alice");
        System.out.println("Leeftijd van Alice:" + ageOfAlice);  //Leeftijd van Alice:25


        //Controleren of een sleutel aanwezig is in de Map
        boolean containsBob = map.containsKey("Bob");
        System.out.println("Bevat bob?" + containsBob);  //Bevat bob?true


        //De grootte van de Map opvragen
        int size = map.size();
        System.out.println("Grootte van de Map:" + size);  //Grootte van de Map:3



        //Alle sleutels van de Map afdrukken
        for (String key : map.keySet()) {
            System.out.println("Sleutel:" + key);  //Sleutel:Bob // Sleutel:Alice //Sleutel:Charlie

        }


        //Allewaarden van de Map afdrukken
        for (int value : map.values())
            System.out.println("Waarde:" + value); //Waarde:30// Waarde:25 //Waarde:35


        //De Map leegmaken
        map.clear();
        boolean isEmpty= map.isEmpty();
        System.out.println("Is de Map leeg?"+isEmpty);  //Is de Map leeg?true

    }

   }