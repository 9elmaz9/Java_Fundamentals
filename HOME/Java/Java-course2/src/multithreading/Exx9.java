package multithreading;

public class Exx9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker1());
        System.out.println(thread.getState()); // sttes   NEW
        thread.start();
        System.out.println(thread.getState());   //RUNNABLE

        thread.join();
        System.out.println(thread.getState());  // TERMINATED

        System.out.println("Method main ends");

    }


}

class Worker1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500); // 2.5 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}

