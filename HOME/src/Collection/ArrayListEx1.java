package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1=new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        // arrayList1.add(50); error
        System.out.println(arrayList1);




        ArrayList<String> arrayList11=new ArrayList<>();
        arrayList11.add("Zaur");
        arrayList11.add("Ivan");
        arrayList11.add("Maria");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2=new ArrayList<>(200); // vmestimost
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");
         // size arrayList22 = 2 , he has two elements,but in the same time he has a  Capacity 200

        List<String> arrayList3=new ArrayList<>(); //  Listit is  interf which implement ArrayList


        ArrayList<String> arrayList4=new ArrayList<>(arrayList1);
        System.out.println(arrayList4); // new obj
        System.out.println(arrayList1==arrayList4); //false ,



        ArrayList arrayList5=new ArrayList();  // obj
        arrayList5.add("Zaur");
        arrayList5.add("Ivan");
        arrayList5.add("Maria");
        arrayList5.add(50);
        arrayList5.add(new Car());  // obj

        System.out.println(arrayList1);



    }

    static class Car{}
}
