package multithreading;

public class Ex8 extends Thread {
    public void run() {
        for (int i = 1; i <=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread  thread9= new Thread(new MyRunnable1());
        Ex8 thread8=new Ex8();
        thread9.start();
        thread8.start();

        thread8.join(); //тормозит поток main, до  окончания потоков thread9 и thread8
        thread9.join();

    System.out.println("End");
    }
}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);

        }

    }
}