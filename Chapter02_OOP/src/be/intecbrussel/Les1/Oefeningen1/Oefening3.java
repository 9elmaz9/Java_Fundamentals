package be.intecbrussel.Les1.Oefeningen1;

public class Oefening3 {

    //efening 3
    //Maak een string met de volgende waarde "hello world" maak
    //nu een algoritme dat van de huidige waarde het volgende
    //maakt "HeLlO WoRlD". Bekijk voor deze oefening zeker de
    //documentatie van Class String van oracle en de vorige
    //hoofdstukken.
    public static void main(String[] args) {


        String str = "hello world";

        // 1  v stroky
        System.out.println(str.replaceAll("hello world", "HeLlo WorlD"));


    /*2 idet vniz

    for(int i=0; i < str.length();++i){
        if(i%2==0) {
            System.out.println(str.toUpperCase().charAt(i));
        }else{
            System.out.println(str.toLowerCase().charAt(i));
        }
    }
*/
    }
}
