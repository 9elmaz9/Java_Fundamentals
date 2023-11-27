package stream;

import java.util.ArrayList;
import java.util.List;


public class Test1 {

    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("ok?");
        list.add("poka ");

        for (int i = 0; i < list.size(); i++) { // ot 0 i do size naschego Lista i++
           // (list.get(i).length())); - eto vozvraschaet int . chobi polycgit String - smotri nizje
            list.set(i, String.valueOf(list.get(i).length())); // String.valueOf - poluchaem string
// proizoshlo preobrazovanie  clov vishe v kol-vo csifr predlozjenia
        }
        System.out.println(list);

    }


}
