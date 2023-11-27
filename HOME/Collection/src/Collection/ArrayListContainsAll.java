package Collection;

import java.util.ArrayList;

public class ArrayListContainsAll {
    public static void main(String[] args) {

        // containsAll  проверяет содержит ли наш ArrayList все элементы ArrayList из нашего параметра


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
        //arrayList2.add("Igor"); если закоментировать . Того что выше тогда будет- true


        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result); // false , т.к в нашем случае в arrayList1 нет Игоря

    }
}


