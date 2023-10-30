import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем вопросы для викторины
        QuizItem[] quizItems = {
                new Question("What is the capital of France?", new String[]{"Paris", "Berlin", "London", "Madrid"}, 1, 10),
                new Question("What is the largest lake in the world?", new String[]{"Caspian Sea", "Upper Lake", "Michigan", "Baikal"}, 3, 5),
                // Добавьте дополнительные вопросы по аналогии
        };

        // Создаем экземпляр викторины
        QuizGame quizGame = new QuizGame(quizItems);

        // Создаем сканнер для ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запускаем викторину
        do {
            quizGame.startGame();

            // Цикл вопросов и ответов
            while (!quizGame.isGameOver()) {
                System.out.print("Enter your answer: ");

                // Цикл для контроля над вводом верных ответов
                int userAnswer;
                do {
                    while (!scanner.hasNextInt()) {
                        System.out.println("Please enter a valid number.");
                        scanner.next(); // Очистка буфера ввода
                    }
                    userAnswer = scanner.nextInt();
                } while (userAnswer < 1 || userAnswer > 4);

                scanner.nextLine(); // Очистка символа новой строки из буфера

                // Обработка ответа
                quizGame.submitAnswer(userAnswer);

                // Вывод сообщения и количества очков
                if (quizGame.getWinnerStatus()) {
                    System.out.println("Congratulations! You are the smartest!");
                } else {
                    System.out.println("Correct! Your current score is: " + quizGame.getScore());
                }
            }

            // Выводим результаты игры
            System.out.println("Game over. Your final score is: " + quizGame.getScore());

            // Предлагаем рестарт
        } while (shouldRestart(scanner));
    }

    // Метод для проверки желания рестарта
    private static boolean shouldRestart(Scanner scanner) {
        System.out.print("Do you want to play again? (yes/no): ");
        String response = scanner.nextLine().toLowerCase();
        return "yes".equals(response);
    }
}

