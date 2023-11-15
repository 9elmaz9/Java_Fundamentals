package Quiz;

import java.util.Scanner;

// Класс, представляющий саму викторину
public class QuizGame {
    private QuizItem[] questions; // Массив вопросов
    private int currentQuestionIndex; // Индекс текущего вопроса
    private int score; // Результат игры (очки)
    private boolean winner; // Статус победителя

    // Конструктор, инициализирующий атрибуты
    public QuizGame(QuizItem[] questions) {
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.score = 0;
        this.winner = false;
    }

    // Метод для начала игры
    public void startGame() {
        currentQuestionIndex = 0;
        score = 0;
        winner = false;
        displayQuestion(); // Вывод первого вопроса
    }

    // Метод для обработки ответа
    public void submitAnswer(int answer) {

        String answerString = String.valueOf(answer);

        // Приведение к верхнему регистру для обработки как буквы
        char letterAnswer = Character.toUpperCase(answerString.charAt(0));

        do {
            while (!isValidAnswer(letterAnswer));{
                System.out.println("Please enter a valid answer ( A,B,C,D).");
                letterAnswer=Character.toUpperCase(answerString.charAt(0));
            //next().toUpperCase().chartAt(0);
            }
        } while (!isValidAnswer(letterAnswer));
        processAnswer((letterAnswer));

    }



    private boolean isValidAnswer(char answer){
            return answer >'A'&& answer <='D' ;

        }


    // ... (оставшаяся часть метода без изменений)
    //String answerString = String.valueOf(answer);
    // public void submitAnswer(int answer) {
    //String answerString = Integer.toString(answer);
    // ... (оставшаяся часть метода без изменений)
    // Попытка преобразовать ответ в число
    // try {
    // int numericAnswer = Integer.parseInt(answer);
    //   processAnswer(numericAnswer);
    // } catch (NumberFormatException e) {
    // Если не удалось преобразовать в число, пробуем обработать как букву
    // Приведение к верхнему регистру Yfbдля обработки как буквы
    // char letterAnswer = Character.toUpperCase(answerString.charAt(0));


    //char letterAnswer = Character.toUpperCase(answer.charAt(0));
    // int numericAnswer = letterAnswer - 'A' + 1;
    //  processAnswer(numericAnswer);


    // Приватный метод для обработки числового ответа
    private void processAnswer(char answer) {
        QuizItem currentQuestion = questions[currentQuestionIndex];
        if (currentQuestion.isCorrect(answer - 'A' + 1)) {
            score += currentQuestion.getPoints();
            System.out.println("Correct! Your current score is: " + score);
        } else {
            System.out.println("Incorrect. The correct answer is: " + (char) ('A' + currentQuestion.correctOption - 1));
        }

        currentQuestionIndex++;

        if (currentQuestionIndex == questions.length) {
            checkWinner();
            promptRestart();
        } else {
            displayQuestion();
        }
    }

    //QuizItem currentQuestion = questions[currentQuestionIndex];
    // if (currentQuestion.isCorrect(answer)) {
    //score += currentQuestion.getPoints();
    // }

    // currentQuestionIndex++;

    // if (currentQuestionIndex == questions.length) {
    // checkWinner();
    // promptRestart();
    //} else {
    //  displayQuestion();
    // }
    // }

    // Приватный метод для отображения вопроса
    private void displayQuestion() {
        QuizItem currentQuestion = questions[currentQuestionIndex];
        System.out.println(currentQuestion.getText());

        for (int i = 0; i < currentQuestion.getOptions().length; i++) {
            System.out.println((char) ('A' + i) + ". " + currentQuestion.getOptions()[i]);
        }
    }

    // Приватный метод для проверки победителя
    private void checkWinner() {
        if (score >= 50) {
            winner = true;
        }
        // Дополнительная логика определения победителя
    }

    // Приватный метод для предложения рестарта
    private void promptRestart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to play again? (yes/no): ");
        String response = scanner.nextLine().toLowerCase();

        if ("yes".equals(response)) {
            restartGame();
        } else {
            System.out.println("Thanks for playing! Goodbye.");
        }
    }


    // Приватный метод для рестарта игры
    private void restartGame() {
        //31.10     // loadQuestions(); // Загрузить вопросы заново
        //currentQuestionIndex = 0; // Сбросить индекс текущего вопроса
        // score = 0;
        //winner = false;
        startGame(); //МОЖЕТ ТОЛЬКО ТА СТРЧОКА
    }

    //private void loadQuestions() { // СПОРНЫЙ ВОПРОС + eto esli dannie vische budut : 31/10
    // Здесь загрузите вопросы заново или создайте новый массив вопросов
    // Например:
    //questions = new QuizItem[]{
    //  new Question("What is the capital of France?", new String[]{"Paris", "Berlin", "London", "Madrid"}, 1, 10),
    // new Question("What is the largest lake in the world?", new String[]{"Caspian Sea", "Upper Lake", "Michigan", "Baikal"}, 4, 10),
    // Добавьте дополнительные вопросы по аналогии
    // };
    //}

    // Метод для проверки завершения игры
    public boolean isGameOver() {
        return currentQuestionIndex == questions.length;
    }

    // Геттер для статуса победителя
    public boolean getWinnerStatus() {
        return winner;
    }

    // Геттер для результата игры (очков)
    public int getScore() {
        return score;

    }

}