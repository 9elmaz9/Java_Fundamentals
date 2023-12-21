package Oefening2;

import java.util.Random;

public class TimeBomb {
    private int countdown;

    public TimeBomb(int countdown) {
        this.countdown = countdown;
    }

    // ()activatie bomb
    public void activate() {
        System.out.println("Bomb activated!You have " + countdown + " seconds to disarm!");


        //create Thread to cout down time
        Thread countdownThread = new Thread(() -> {
            while (countdown > 0) {
                System.out.println(countdown + " seconds  left ");
                try {
                    Thread.sleep(1000); // 1 sec sleep;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countdown--;
            }
            //time's up, the bomb exploded
            System.out.println("Booooom!The bomb exploded!!!");
        });

        //Starting the timing thread
        countdownThread.start();
    }


    //Bomb defusing method
    public void disarm() {
        if (countdown > 0) {
//if  we have time to defusing , then do it
            System.out.println("You have enough time.Bomb disarmed!");

            countdown = 0; // resetting the time counter
        } else {
            //if time is up the bomb exploded
            System.out.println("The bomb exploded!BOOOOMM!!!!");
        }
    }
}


class VillainSpot {
    public static void main(String[] args) {
        Random random = new Random();
        TimeBomb timeBomb = new TimeBomb(10); // bomb has 10 SEK
        timeBomb.activate();
        try {
            Thread.sleep(random.nextInt(30_000)); // it will take +- 3à sek to disarm the bomb
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timeBomb.disarm();
        System.out.println("Bam");
    }
}