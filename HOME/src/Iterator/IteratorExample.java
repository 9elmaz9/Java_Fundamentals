package Iterator;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {


     //   Creating Iterator

     //  Iterator<Data type> iter =aL.iterator();
     //  while (iter.hasNext()){
     //      System.out.println(iter.next());                  // vivod na ekran elementy podryad
     //  }


        ArrayList<String> arrayList1=new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        // iterator - herhal
        Iterator<String> iterator = arrayList1.iterator(); //using as iterator i can delete/remove an  element  from a collection
        while (iterator.hasNext()) { // check have or not next element
            iterator.next(); // next-getting the element
            iterator.remove(); // delete  , without .next - cant delete

        }
        System.out.println(arrayList1); //[]

    }

    }



