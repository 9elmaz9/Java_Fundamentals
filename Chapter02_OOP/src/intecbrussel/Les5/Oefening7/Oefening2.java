package be.intecbrussel.Les5.Oefening7;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Oefening 2
//Schrijf een programma om de tijd en datum te formatteren naar: ma, 22 aug. 2022 14:54:24

public class Oefening2 {
    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting:" + now);

// prosto vpisat daty novuy - net
        DateTimeFormatter format = DateTimeFormatter.ofPattern("ma,MMM dd YYYY ");
//22-08-2022 14:54.24
        String formatDateTime = now.format(format);
        System.out.println("After Formatting:" + formatDateTime);

        }
    }

