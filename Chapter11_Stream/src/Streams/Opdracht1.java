package Streams;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Opdracht1 {

    // methhod1 : Converteert alle strings in de lijst naar hoofdletters
    public List<String> toUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    //method2 : Filtert strings die beginnen met "a"
    public List<String> filterA(List<String> strings) {
        return strings.stream() //converts the list of strings into a Stream.
                .filter(s -> s.startsWith("a")) // filters out the strings that don't start with "a"
                .collect(Collectors.toList()); // collects the filtered elements into a new List
    }


    //method3 : filtert de strings in de lijst op basis van twee voorwaarden:
    // ze moeten beginnen met 'a' en een lengte hebben groter dan 3.
    public List<String> filterB(List<String> strings) {
        // Gebruik Java Streams om strings te filteren op basis van twee voorwaarden
        return strings.stream()
                .filter(s -> s.startsWith("a") & s.length() > 3)
                .collect(Collectors.toList());
    }


    //method4 :  is vergelijkbaar met Method3, maar het keert de resulterende lijst om voordat het deze teruggeeft.
    public List<String> filterC(List<String> strings) {
        List<String> filteredList = strings.stream()
                .filter(s -> s.startsWith("a") && s.length() > 3)
                .collect(Collectors.toList()); //It's used to transform the elements of a stream into a different form, usually a List.

        Collections.reverse(filteredList);
        return filteredList;
    }

    //method5 : roept Method4 aan,
    // verzamelt de resultaten met een komma als scheidingsteken en geeft de samengevoegde string terug.
    public String filterD(List<String> strings) {
        List<String> filteredList = filterC(strings);
        return String.join(",", filteredList);
        //.join об’єднує задані елементи з роздільником і повертає об’єднаний рядок.
    }

    //method6 :roept Method4 aan, zet de resultaten om in hoofdletters en geeft de samengevoegde string terug.
    public String filterF(List<String> strings) {
        List<String> filteredList = filterC(strings);
        return String.join(",", toUpperCase(filteredList));
    }

    //method7 :roept Method4 aan, zet de resultaten om in hoofdletters,
    // beperkt de string tot 10 karakters en geeft deze terug.
    public String filterE(List<String> strings) {
        List<String> filteredList = filterC(strings);
        String result = String.join(",", toUpperCase(filteredList));
        return result.length() > 10 ? result.substring(0, 10) : result;
    }

    //method8 :  roept Method4 aan, zet de resultaten om in hoofdletters,
    // beperkt de string tot 10 karakters, voegt een prefix en een suffix toe en geeft het resultaat terug.

    public String filterG(List<String> strings) {
        List<String> filteredList = filterC(strings);
        String result = String.join(",", toUpperCase(filteredList));
        result = result.length() > 10 ? result.substring(0, 10) : result;
        return "Prefix - " + result + " - Suffix";
    }

    //method9 : is vergelijkbaar met Method8, maar voegt ook een uniek tijdstempel (timestamp) toe.
    public String filterH(List<String> strings) {
        List<String> filteredList = filterC(strings);
        String result = String.join(",", toUpperCase(filteredList));
        result = result.length() > 10 ? result.substring(0, 10) : result;
        return "Prefix - " + result + " - Suffix" + System.currentTimeMillis();

    }
    //meyhod10 : is vergelijkbaar met Method9, maar voegt ook een willekeurig getal toe.
    public String filterI(List<String> strings){
        List<String> filteredList = filterC(strings);
        String result =String.join(",",toUpperCase(filteredList));
        result=result.length()>10 ? result.substring(0,10): result;
        return "Prefix - " +result+ " - Suffix" + System.currentTimeMillis() + " - Random - " + new Random().nextInt(100);
    }



}


