
package Les3.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        //Een LinkedHashSet maken en elementen toevoegen
        LinkedHashSet<String> set = new java.util.LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); //Duplicate element, wordt genegeerd
        System.out.println("LinkedHashSet:"+set); //LinkedHashSet:[Apple, Banana, Orange]



        //Controleren of een element in de LinkedHashSet zit
        boolean containsApple=set.contains("Apple");
        System.out.println("Contains Apple? "+ containsApple); //Contains Apple? true



        //Een element uit de LinkedHashSet verdwideren
        boolean removed=set.remove("Orange");
        System.out.println("Removed Orange?" + removed); //Removed Orange?true



        //De grootte van de LinkedHashSet opvragen
        int size = set.size();
        System.out.println("Size of LinkedHashSet:" +size); //Size of LinkedHashSet:2



        //De LinkedHashSet leegmaken
        set.clear();
        boolean isEmpty=set.isEmpty();
        System.out.println("Is LinkedHashSet empty?"+isEmpty); //Is LinkedHashSet empty?true



    }
}
