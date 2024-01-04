package Oegening1;

import java.time.LocalDateTime;

public class vb3 {
    public static void main(String[] args) {

        System.out.println("Start time"+ LocalDateTime.now());
        System.out.println("The countdown begins.");
        try {
            for (int i = 10; i > 0; --i) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Happy New Year!");
        System.out.println("End Time: "+ LocalDateTime.now());
    }

}
