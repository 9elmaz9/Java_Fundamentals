package Les2;

import java.util.Date;

public class PrintAppLambdaDaemon {
    public static void main(String[] args) {
        Thread thread1= new Thread(()-> print(ThreadColors.ANSI_BLUE + "1",100));
        Thread thread2= new Thread(()-> print(ThreadColors.ANSI_BLUE + "2",100));
        //
        thread2.setDaemon(true); //  voor de 2 thread
        thread1.start(); // dan deze print
        thread2.start();
        //Om aantal beschikbare cores op te vragen
        System.out.println(Runtime.getRuntime().availableProcessors()); // this is first print
    }
    private  static  void print(String text, int count){
        for (int j = 0; j < count; j++) {
            System.out.print(text);
            //De lus binnen de printmethode roept bij elke stap Thread.yield() aan,
            //waarde de processortijd beschikbaar wordt gemaakt voor doorgeven aan andere threads.
            Thread.yield();

        }
    }
}
