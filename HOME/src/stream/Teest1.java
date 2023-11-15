package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Teest1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka ");

        //     for (int i = 0; i < list.size(); i++) {           // ot 0 i do size naschego Lista i++//
        //   list.set(i, String.valueOf(list.get(i).length()));

// proizoshlo preobrazovanie  clov vishe v kol-vo csifr predlozjenia

        //vmesto  "privet" - uje 6 etc
        List<Integer> list2 = list.stream().map(element -> element.length())
                .collect((Collectors.toList()));  // preobrazoval nash potok v List  - etot potok - list.stream().map(element ->element.length())

        System.out.println(list2);

        // list [privet, kak dela?, ok?, poka ]
        // list2  [6, 9, 3, 5]


        int[] array = {5, 9, 3, 8, 1};  // potok
        //5,3,1,8,1
        //iz massiva poluchit stream
        // teper strim eto staticheskiu methodArraus
        array = Arrays.stream(array).map(element          // array = prisvoili naschemy array  to.Array()      // eto vse LAmbda virazjenie
                -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;

        }).toArray();

        // System.out.println(Arrays.toString(array));//[5, 3, 1, 8, 1]
        //snachala mi preobrazovali potok , a potom iz potika poluchili massiv


        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set); // doljen otsortirovatca ot menshego k bolshemy
        //[OK, kak dela?, poka, privet]

        //6 9 2 4
        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());

        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList()); // preobrazyem potok v list iz seta
        //sortirovki ne budet

        System.out.println(set2);//[2, 4, 6, 9]
        //potik preobrazovan v Set, ot menshego k bilshemy


        System.out.println(list3); //[2, 9, 4, 6] sortirovka ne proizoshla



    }
}




