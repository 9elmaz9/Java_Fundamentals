package WhatALife;

public class HeartBeat implements Runnable {
    //variable
    int milliSecondsBetweenBeats ;

    // constructor die parametr opvraagt
    public HeartBeat(int milliSecondsBetweenBeats) {
        this.milliSecondsBetweenBeats = milliSecondsBetweenBeats;
    }
    @Override  // endless loop + print heartbeat
    public void run() {
        try {
            while (true){
                System.out.println("Heartbeat: thump thump thump thump "); // klop / tuc
                Thread.sleep(milliSecondsBetweenBeats);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
