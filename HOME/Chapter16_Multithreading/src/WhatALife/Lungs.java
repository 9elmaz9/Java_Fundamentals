package WhatALife;

public class Lungs implements Runnable {
    //variable
    private boolean lungsFull=false;


    //een oneindige loop
    // & keer per second / Dit wilt zeggen dat die dat gaat moeten alterneren
    @Override
    public void run() {
        try {
            while (true) {
                if (lungsFull) { // conditie
                    System.out.println("Breathe out");
                    lungsFull = false;
                } else {
                    System.out.println("Breathe in");
                    lungsFull = true;
                }
                Thread.sleep(10000); // 1 sec pause
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}





