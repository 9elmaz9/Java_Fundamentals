package Les3.Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        //Een TreeSet maken en elementen toevoegen
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(2);
        set.add(8);
        set.add(3);
        System.out.println("TreeSet:"+ set);   // ot bolshego k menshemy  TreeSet:[2, 3, 5, 8, 10]

        //Het eerste en laatste element van de TreeSet opvragen
        Integer firstElement=set.first();
        Integer lastElement=set.last();
        System.out.println("First element:"+firstElement); //First element:2 kleinste

        System.out.println("Last element:"+lastElement); //Last element:10  grootste


        //Een elemnt in de TreeSet zoeken dat kleiner is dan een opgegeven waarde
        Integer lowerValue= set.lower(5);
        System.out.println("Element lower than 5 :"+ lowerValue ); // Element lower than 5 :3



        //De TreeSet afdrukken in omgekeerde volgorde=Распечатайте TreeSet в обратном порядке.
        TreeSet<Integer> descendingSet =( TreeSet<Integer>)set.descendingSet();
        System.out.println("Descending TreeSet: "+ descendingSet); //Descending TreeSet: [10, 8, 5, 3, 2]



        //Een subset van de TreeSet maken - Создайте подмножество TreeSet
        TreeSet<Integer>subset=(TreeSet<Integer>)set.subSet(3,8);
        System.out.println("Subset TreeSet:"+subset); //Subset TreeSet:[3, 5]


        //De TreeSet leegmaken - Очистить
        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is TreeSet empty?"+ isEmpty); //Is TreeSet empty?true







    }
}
