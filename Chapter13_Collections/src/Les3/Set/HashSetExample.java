package Les3.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        //Een HashSet maken en elementen toevoegen
        HashSet<String>  set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate element, wordt genegeerd : Дублирующийся элемент игнорируется.
       // set.add("null");  // 1 keer null

        System.out.println("HashSet:"+ set); //HashSet:[Apple, Orange, Banana]


        //Controleren of enn element in de HashSet zit
        boolean containsApple=set.contains("Apple");
        System.out.println("Contains Apple ? "+ containsApple); // Contains Apple ? true


        //Een element uit de HashSet verwijderen
        boolean removed = set.remove("Orange");
        System.out.println("Removed Orange?" + removed); // Removed Orange?true




        //De grootte van de HashSet opvragen
        int size = set.size();
        System.out.println("Size of HashSet:" + size);  // Size of HashSet:2


        //DE HashSet leegmaken
        set.clear();
        boolean isEmpty= set.isEmpty();
        System.out.println("Is HashSet empty?"+isEmpty); //Is HashSet empty?true


    }
}
