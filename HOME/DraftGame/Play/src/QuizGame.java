import java.util.Scanner;

public class QuizGame extends Game {
    public static void main(String[] args) {
        new QuizGame().startGame();
    }

    @Override
    void startGame() {
        questions = new Question[]
                {new Question("What is the capital of France?", new Answer[]{new Answer("Berlin", null),
                        new Answer("Paris",new Prize("Eiffel Tower Replica", " A smal replica of the Eiffel tower")),
                                new Answer("Madrid", null),
                                new Answer("Rome", null)
                },
                        1),
                };


        currentQuestionIndex = 0;
        playScore = 0;
        Scanner scanner = new Scanner(System.in);
        while (currentQuestionIndex < questions.length) {
            displayQuestion();
            System.out.println("Tour answer:");

            int answerIndex = scanner.nextInt() - 1; //adjusting for 0 -based indexong

            checkAnswer(answerIndex);
        }

        System.out.println("Game over!Your final score :" + playScore);
        displayPrize();


    }
}