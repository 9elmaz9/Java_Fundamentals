package Les1.runnable;

public class MultithreadingDemo {
    public static void main(String[] args) {
        
        int  n = 8; // number of treads 
        for (int i = 0; i < n ; i++) {
            Thread object = new Thread(new Multithreading());
            object.start();
            
        }
    }
}
