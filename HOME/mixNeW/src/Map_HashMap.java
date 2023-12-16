import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
    public static void main(String[] args) {

        /*      KEY   : VALUE

         *   "red"    : "apple"
         *   "yellow" : "banana"
         *   "white"  : "radish"
         *   "green"  : "apple"
         * */

        Map<String, String> fruits = new HashMap<>();
        fruits.put("red", "apple");
        fruits.put("yellow", "banana");
        fruits.put("white", "radish");
        fruits.put("green", "apple");

//		fruits.containsKey("red");      // returns true, if key is found
//		fruits.containsValue("apple");  // returns true, if value is found
//		fruits.size();                  // returns the size of the MAP
//		fruits.remove("red");      // Deletes the Entry whose key is "red"
//		fruits.clear();

        System.out.println(fruits.get("red"));

        for (Map.Entry pairEntry: fruits.entrySet()) {
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }
    }
}
