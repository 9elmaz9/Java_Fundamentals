package Les1.Example2;

public class Main {
    public static void main(String[] args) {

        //extendc Thread
        //vreer een subklas van Thread

        MyThread thread1=new MyThread();

        //implements Runnable
        //pas een instantce als een argument in Thread
        MyRunnable runnable1= new MyRunnable();
        Thread thread2=new Thread(runnable1);

        //thread1.getDaemon(true);
        //thread2.setDaemon(true);

        thread1.start();
        //threads.join(3000);
        thread2.start();
    }

}
