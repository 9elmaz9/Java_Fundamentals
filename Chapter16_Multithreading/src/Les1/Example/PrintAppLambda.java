package Les1.Example;

public class PrintAppLambda {
    public static void main(String[] args) {
        // Создаем два потока с использованием lambda-выражений
        Thread thread1 = new Thread(() -> print('c', 10));
        Thread thread2 = new Thread(() -> print('*', 10));

        // Выводим состояние потоков до их запуска
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

        // Запускаем потоки
        thread1.start();
        System.out.println(thread1.getState());

        thread2.start();
        System.out.println(thread2.getState());

        // Вызываем метод print в главном потоке
        print('&', 10);
    }

    // Метод для печати символа заданное количество раз
    public static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
    }
}
