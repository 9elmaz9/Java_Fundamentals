package multithreading;

public class Ex31 implements Runnable {
    @Override
    public void run() {
        // задача первого потока
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);

        }

    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Ex31());    // первый поток
        thread1.start();


        for (int i = 1000; i > 0; i--) { // второй поток. так как  main тоже поток
            System.out.println(i);

            //      Thread thread1 = new Thread(new multithreading.Ex3.MyThread3());
            //      Thread thread2 = new Thread(new multithreading.Ex3.MyThread4());
            //      thread1.start();
            //      thread2.start();


        }

    }
}
//     static class MyThread3 implements Runnable {
//         public void run() {

//             for (int i = 1; i < 1000; i++) {
//                 System.out.println(i);

//             }
//         }
//     }


//     static class MyThread4 implements Runnable {
//         public void run() {

//             for (int i = 1000; i > 0; i--) {
//                 System.out.println(i);

//             }
//         }
//     }


// }

//}
