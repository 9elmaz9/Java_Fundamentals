package be.intecbrussel.Les4;
import  java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//Deze klas kan gebruikt worden om datum en tijd te printen en ontleden
//zodat je een leesbaarder ontwerp krijgt. Hieronder vind je een paar patronen
//die je kunt gebruiken

public class DateTimeFormatterClassExample {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting:" + now);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-HH:mm:ss");

        String formatDateTime = now.format(format);
        System.out.println("After Formatting:" + formatDateTime);

    }
}