package VBtimeBomb;

import java.util.Random;

public class VillianSpot {
    private int i;
    public static void main(String[] args) {
        Random random = new Random();
        TimeBomb timeBomb = new TimeBomb(10); // Bomb has 10 seconds!
        timeBomb.activate();
        try {
            Thread.sleep(random.nextInt(30000)); // It will take us between 0-30 secs to disarm the bomb.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timeBomb.disarm();
    }

}
