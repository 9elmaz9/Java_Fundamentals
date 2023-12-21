package Les1.Example.synchronize;

public class Multithread {
    public static void main(String[] args) {

        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Demo object = new Demo();
            object.start();

        }
    }
}
