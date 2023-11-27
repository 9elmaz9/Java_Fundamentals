package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListListOf {

    public static void main(String[] args) {

      ArrayList<String> arrayList1 = new ArrayList<String>();
      arrayList1.add("Zaur");
      arrayList1.add("Ivan");
      arrayList1.add("Mariya");
      arrayList1.add("Kolya");
      arrayList1.add("Elena");
      System.out.println("ArrayList= " + arrayList1);



        // static method
        // List.of
        List<Integer> list1 = List.of(3,8,13);    // [3, 8, 13]
        System.out.println(list1); // нельзя менять и модифицировать
        // list1.add(100); // error


        //List.cope
        List<String> list2=List.copyOf(arrayList1); // can't modification
        System.out.println(list2); // не могут содержать знанение null



    }
}
