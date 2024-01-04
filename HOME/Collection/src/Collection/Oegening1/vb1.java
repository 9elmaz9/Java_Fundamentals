package Oegening1;

import java.time.LocalDateTime;

public class vb1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread= new Thread(new Time());
        thread.start();
        thread.sleep(100000);
        thread.join();
        System.out.println(thread);


    }


    private static class Time implements Runnable {
        @Override
        public void run() {
            LocalDateTime now = LocalDateTime.now();
            System.out.println("Time:" + now+"ms");

            try {
                Thread.sleep(10000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
