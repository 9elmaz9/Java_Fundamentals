package Oefening;

import java.time.LocalDateTime;

public class Prob2 {
    public static void main(String[] args) {

        int countdownSeconds = 10;
        for (int i = countdownSeconds; i > 0; i--) {
            System.out.println("Tijd :" + LocalDateTime.now() + "|Aftellen :" + +i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tijd is om!");
    }
}