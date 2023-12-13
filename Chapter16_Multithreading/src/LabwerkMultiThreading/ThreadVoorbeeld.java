package LabwerkMultiThreading;

//een nieuwJava klasse
public class ThreadVoorbeeld {

    private int count = 0;


    public static void main(String[] args) {
        ThreadVoorbeeld voorbeeld = new ThreadVoorbeeld();
        InnerThread thread1 = new InnerThread(voorbeeld);
        InnerThread thread2 = new InnerThread(voorbeeld);
        InnerThread thread3 = new InnerThread(voorbeeld);


        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();

        System.out.println("Hallo vanaf de hoofdthread");

    }

    private static class InnerThread extends Thread {
        //gebruik synchronized

        private ThreadVoorbeeld voorbeeld;

        public InnerThread(ThreadVoorbeeld voorbeeld) {
            this.voorbeeld = voorbeeld;

        }

        @Override
        public void run() {
            voorbeeld.incrementCount();
            System.out.println("Hallo vanaf thread" + this.getId() + " ,count is nu " + voorbeeld.getCount());

              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
        }
    }


    public synchronized void incrementCount() {
        count++;
    }

    public int getCount() {
        return count;
    }
}


