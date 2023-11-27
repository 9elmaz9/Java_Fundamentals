package Collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListToArray {
    public static void main(String[] args) {


        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        //System.out.println("ArrayList= " + arrayList1);
        Object[] array = arrayList1.toArray();

        // если хочется получить   массив String  массив  из нашего  ArrayList

        String[] array2 = arrayList1.toArray(new String[2]); // в параметре указывает создание массива стринг
        // выводим элементы
        for (String s : array2) { //  из array2 выводит элементы на экран
            System.out.println(s);
            //Zaur
            //Ivan
            //Mariya
            //Kolya
            //Elena

//-----------------------------------
            //если индекс больше чем элементов
        //   String[] array3 = arrayList1.toArray(new String[7]); // в параметре указывает создание массива стринг
        //   // выводим элементы
        //   for (String st : array3) { //  из array2 выводит элементы на экран
        //       System.out.println(st);
        //       //Zaur
        //       //Ivan
        //       //Mariya
        //       //Kolya
        //       //Elena
        //       //null
        //       //null


            }

        }
    }

