package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        //  arrayLis1.add(50);  error , only for String
        System.out.println(arrayList1);


        ArrayList<String> arrayList11 = new ArrayList<>();

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");
        // capacity - 200, if 201 - ArrayList wil increase
        // size = 2


        List<String> arrayList3 = new ArrayList<>();



        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
        System.out.println(arrayList1==arrayList4); // не ссылаются на 1 обьект arrayList . но элементы этих одинаковые


        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("Zaur");
        arrayList5.add("Ivan");
        arrayList5.add("Mariya");
        arrayList5.add(50);
        arrayList5.add(new Car());


        System.out.println(arrayList1);
    }
}


class Car{}