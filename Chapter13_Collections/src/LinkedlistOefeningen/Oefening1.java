package LinkedlistOefeningen;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.Currency.getInstance;

public class Oefening1 {
    public static void main(String[] args) {


    //  ArrayList<Integer> list1 = new ArrayList<>();
    //  list1.add(1);
    //  list1.add(2);
    //  list1.add(3);
    //  list1.add(3);

     //  ArrayList<String> list2 = new ArrayList<>();
     //  list2.add("BB");
     //  list2.add("CC");
     //  list2.add("DD");
     //
     //  arrayListOfLists.add(list1);

    // LinkedList<Integer> linkedListOfList= new LinkedList<>();
    //for (ArrayList<Integer> arrayList: arrayListOfLists) {
    //    linkedListOfList.add(new LinkedList<>(arrayList));
    //
    //}

        //Maak een ArrayList wordSet voeg hier een aantal woorden aan toe.
        ArrayList<String > wordSet=new ArrayList<>(Arrays.asList("apple","ananas","wortel","banana"));

        //Maak vervolgens een tweede ArrayList
        ArrayList<String> wordSet2=new ArrayList<>(Arrays.asList("oranje","tomato","aardappel","pear"));

        //een nieuwe ArrayList = verbind de twee hierboven ArrayList samen
        List<String> MixList = new LinkedList<>(wordSet);
        MixList.addAll(wordSet2);

        System.out.println(MixList);
        //[apple, ananas, wortel, banana, oranje, tomato, aardappel, pear]


    }
}
