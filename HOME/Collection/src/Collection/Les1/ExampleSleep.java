package Les1;

public class ExampleSleep {
    public static void main(String[] args) {
        try{

            Thread thread01= new Thread(new MijnThread("@",10));
            Thread thread02= new Thread(new MijnThread("-",100));
            System.out.println(thread01.getState());
            System.out.println(thread01.getState());
            thread01.start();
            thread02.start();

            Thread.sleep(2000);
            System.out.println(thread01.getState());
            thread01.interrupt();
            System.out.println(thread01.getState());
            Thread.sleep(500);
            thread01.interrupt();
            Thread.sleep(500);
            thread01.interrupt();

        }catch (InterruptedException exception){
            exception.printStackTrace();
        }

    }
}
