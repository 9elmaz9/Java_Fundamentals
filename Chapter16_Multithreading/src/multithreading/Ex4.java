package multithreading;

public class Ex4 {
    public static void main(String[] args) {  // 3 потока работают паралелльно
        new Thread(new Runnable() {   // anonim class
            @Override
            public void run() {
                System.out.println("Hello");

            }
        }).start();

// 2
        new Thread(()->System.out.println("hello")).start();



    }
}
