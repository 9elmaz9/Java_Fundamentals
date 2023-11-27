package Collection;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethod4 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder[] array= {sb1,sb2,sb3,sb4};
        List<StringBuilder>list = Arrays.asList(array); // с помощью этого метода получаем лист из массива
        System.out.println(list); // полностью сформирован . длинна изменится не может
        //[A, B, C, D]

        //изменим sb1
        array[0].append("!!!"); // мы изменили 0 эдемент нашего массива
        System.out.println(list); // [A!!!, B, C, D]


        // не изменим элемент  а на его место вставим другой
        array[1]=new StringBuilder("F");
        System.out.println(list); // [A!!!, F, C, D]




        //----------------------
        //removeAll method


    }
}
