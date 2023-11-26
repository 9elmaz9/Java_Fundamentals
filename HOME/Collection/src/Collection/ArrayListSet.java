package Collection;

import java.util.ArrayList;

public class ArrayListSet {
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

        arrayList1.set(1,"Masha");
        arrayList1.remove(0); // [Masha,  Ivan ,  Mariya ]



        System.out.println(arrayList1); // [ Zaur , Masha,  Ivan ,  Mariya ]




    }
}
