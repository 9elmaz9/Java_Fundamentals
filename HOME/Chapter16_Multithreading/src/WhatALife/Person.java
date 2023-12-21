package WhatALife;

import java.util.Random;

public class Person implements Runnable {
    //eigenschappen
    private String name;
    private int age;
    private Thread heart;
    private Thread breathing;
    private Thread life;


    //constructor : Thread this gebruikt als parameter
    // heartbeat gebruikt als parameter in 2 Thread
    //Lungs gebruikt in 3 Thread
    //de laatste 2 zouden moeten stoppen wanneer de "life" -draad stopt
    public Person(String name, int age,int heartBeatMilliSeconds) {
        this.name = name;
        this.age = age; // startPunt
        this.heart=new Thread(new HeartBeat(heartBeatMilliSeconds));
        this.breathing=new Thread(new Lungs());
        this.life=new Thread(this);
    }

    @Override
    public void run() {
        try {
            for (int i = age; i <100 ; i++) { // age startpunt
                Thread.sleep(1000);
                int random=new Random().nextInt(20)+1; //  gaat tot 20
                if (random ==13){ // dood
                    endLife();
                    System.out.println("end life");
                    break;
                }

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void startLife(){  // om de Thread te starten
        heart.start();
        breathing.start();
        life.start();
    }
    public  void endLife(){ // om de Thread te end
        life.interrupt();
    }

}
