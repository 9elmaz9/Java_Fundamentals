package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubList {
    public static void main(String[] args) {


        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println("ArrayList= " +arrayList1); // [Zaur, Ivan, Mariya, Kolya, Elena]



        // из этого ArrayList создаем отрывок и помещаем его в лист
        List<String> myList=arrayList1.subList(1,4);       // не включая 3, поэтому указываем тут 4 = 4 не включен
        System.out.println("Sub list = " +myList); // [Ivan, Mariya, Kolya]


        myList.add("Fedor");
        System.out.println("Sub list = " + myList); // [Ivan, Mariya, Kolya, Fedor]
        System.out.println("ArrayList = " + arrayList1); // [Zaur, Ivan, Mariya, Kolya, Fedor, Elena]

        arrayList1.add("Sveta"); // добавляем элемент света,он будет последний
        System.out.println("ArrayList = " + arrayList1); // [Zaur, Ivan, Mariya, Kolya, Fedor, Elena]
        // System.out.println("Sub list = " + myList); //  error




    }

}
