package Collection;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add(" Zaur ");  // add добавляет новый элемент
        arrayList1.add(" Ivan ");
        arrayList1.add(" Mariya ");
        arrayList1.add(1, " Misha ");
        for (String s : arrayList1) {
            System.out.print(s + " "); // Zaur Ivan Mariya
        }
        System.out.println();
        // ArrayList<int> arrayList2 = new ArrayList<String>(); error - int must be -Integer

        // ArrayList<Integer> arrayList2 = new ArrayList<>();
        // arrayList2.add(6);


 //    for (int i = 0; i < arrayList1.size(); i++) {
 //       // System.out.println(arrayList1.get(2)); // Ivan
 //        System.out.print(arrayList1.get(i)); //  Zaur  Misha  Ivan  Mariya
 // }




    }


}
