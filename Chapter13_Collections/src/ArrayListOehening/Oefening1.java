package ArrayListOehening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Oefening1 {
    public static void main(String[] args) {

        //Maak een ArrayList wordSet voeg hier een aantal woorden aan toe.
        ArrayList<String> wordSet = new ArrayList<>(Arrays.asList("apple", "ananas", "wortel", "banana"));

        //Maak vervolgens een tweede ArrayList
        ArrayList<String> wordSet2 = new ArrayList<>(Arrays.asList("oranje", "tomato", "aardappel", "pear"));

        //een nieuwe ArrayList = verbind de twee hierboven ArrayList samen
        List<String> MixList = new ArrayList<>(wordSet);
        MixList.addAll(wordSet2);

        System.out.println(MixList);
        //[apple, ananas, wortel, banana, oranje, tomato, aardappel, pear]


    }
}
