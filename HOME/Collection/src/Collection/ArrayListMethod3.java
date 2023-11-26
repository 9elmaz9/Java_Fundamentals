package Collection;

import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {


        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");  // add добавляет новый элемент 0
        arrayList1.add("Ivan");// 1
        arrayList1.add("Mariya"); //2
        System.out.println(arrayList1); // [Zaur, Ivan, Mariya]
        System.out.println(arrayList1.contains("Mariya"));


        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("!!!");  // add добавляет новый элемент
        arrayList2.add("???");
        arrayList1.addAll(arrayList2); // addAll
        System.out.println(arrayList1); // [Zaur, Ivan, Mariya, !!!, ???]


        arrayList1.addAll(1,arrayList2); //  [Zaur, !!!, ???, Ivan, Mariya, !!!, ???]
        System.out.println(arrayList1);  //  [Zaur, !!!, ???, Ivan, Mariya, !!!, ???]

        arrayList1.clear();
        System.out.println(arrayList1); // remove []



        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("Zaur");  // 0
        arrayList3.add("Ivan");// 1
        arrayList3.add("Mariya"); //2
        arrayList3.add("Ivan");
        System.out.println(arrayList1);
        System.out.println(arrayList3.indexOf("Ivan")); // indexOf search Ivan - Ivan index is 1
        System.out.println(arrayList3.lastIndexOf("Ivan")); // 3 search from end

        System.out.println(arrayList3.size()); // 4
        System.out.println(arrayList3.isEmpty()); // false
        //------------------------------------
        arrayList3.clear();
        System.out.println(arrayList3.isEmpty()); // true

        //--------------------------------
        // contains
        System.out.println(arrayList3.contains("Zaur")); // false bc - arrayList3.clear();    , now arrayList3 is empty
        System.out.println(arrayList1.contains("Kolya")); // check in arrayList 1 - element Kolya - false


        //toString
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("Zaur");  // 0
        arrayList4.add("Ivan");// 1
        arrayList4.add("Mariya"); //2
        arrayList4.add("Ivan");
        System.out.println(arrayList4.toString()); // [Zaur, Ivan, Mariya, Ivan]
    }
}
