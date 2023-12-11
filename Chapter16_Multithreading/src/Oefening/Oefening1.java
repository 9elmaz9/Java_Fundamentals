package Oefening;

import java.time.LocalDateTime;

public class Oefening1 {
    public static void main(String[] args) {



        int countdownSeconds = 10;
        LocalDateTime now = LocalDateTime.now();
        for (int i = countdownSeconds; i >0; i--) {
            countdownSeconds --; // voor loop 10 - 9 - 8 -7 ... ect
            System.out.println("Tijd :" + now+ "|Aftellen :" + +i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tijd is om!");
    }
}


