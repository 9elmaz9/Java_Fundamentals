package VBtimeBomb;

public class TimeBomb {
    int countdownSeconds = 0;

    public TimeBomb(int countdownSeconds) {
        this.countdownSeconds = countdownSeconds;
    }

    public  void activate() {
        System.out.println("Bomb activated! Countdown started.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  void disarm() {
        System.out.println("Bomb disarmed");


    }
}
