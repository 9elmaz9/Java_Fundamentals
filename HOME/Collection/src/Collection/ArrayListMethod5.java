package Collection;

import java.util.ArrayList;

public class ArrayListMethod5 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        System.out.println(arrayList1);


        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Ivan");
        arrayList2.add("Mariya");
        arrayList2.add("Igor");

       //removeAll - удаляет те параметры в певом которые есть во втором
       // arrayList1.removeAll(arrayList2); // [Zaur, Ivan, Mariya, Kolya]


        //retaiAll = оставляет параметры другого а наши которые были убирает
        arrayList1.retainAll(arrayList2);  // [Ivan, Mariya]


        System.out.println(arrayList1); // [Zaur, Kolya]
       // System.out.println(arrayList2);



    }
}
