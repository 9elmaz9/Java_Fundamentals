package Les1.Example.synchronize;

public class Demo extends Thread {
    //main class

    @Override
    public void run() {

        try {
            //Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + "is running");
        } catch (Exception e) {
            //Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
