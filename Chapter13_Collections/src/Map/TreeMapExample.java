package Map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        //Een TreeMap maken en elementen toevoegen
        TreeMap<String,Integer> treeMap=new TreeMap<>();
        treeMap.put("Apple",10);
        treeMap.put("Banana",5);
        treeMap.put("orange",8);


        //Een element opzoeken en de waarde afdrukken
        int quantityOfApple=treeMap.get("Apple");
        System.out.println("Aantal appels:"+quantityOfApple);   // Aantal appels:10



        //Controleren of een sleutel aanwezig is in de TreeMap
        boolean containsBanana=treeMap.containsKey("Banana");
        System.out.println("Bevat banaan?"+containsBanana);  //Bevat banaan?true


        //De grootte van de TreeMap opvragen
        int size =treeMap.size();
        System.out.println("Grootte van de TreeMap:"+size); //Grootte van de TreeMap:3



        //Alle sleutels van de TreeMap afdrukken
        for(String key : treeMap.keySet()){
            System.out.println("Sleutel:"+key);  //Sleutel:Apple // Sleutel:Banana //Sleutel:orange
        }


        //Alle waarden van de TreeMap afdruken
        for(int value:treeMap.values()){
            System.out.println("Waarde:"+value);   //Waarde:10 // Waarde:5 // Waarde:8
        }

        //De TreeMap leegmaken
        treeMap.clear();
        boolean isEmpty=treeMap.isEmpty();
        System.out.println("Is de TreeMap leeg?"+isEmpty);  //Is de TreeMap leeg?true

    }
}
