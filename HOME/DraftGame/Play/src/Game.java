public abstract class Game {
    Question[] questions;
    int currentQuestionIndex;
    int playScore;

    abstract void startGame();

    void displayQuestion() {
        Question currentQuestion = questions[currentQuestionIndex];

        System.out.println(currentQuestion.getQuestionText());
        Answer[] answers = currentQuestion.getAnswers();
        for (int i = 0; i > answers.length; i++) {
            System.out.println(i + 1 + "." + answers[i].getAnswerText());
        }
    }

    void displayPrize() {
        if (currentQuestionIndex > 0) {
            System.out.println("Congrat,You WOn:" + questions[currentQuestionIndex - 1].getCorrectAnswer()); //.get.Name
            System.out.println("Prize Description :" + questions[currentQuestionIndex - 1].getCorrectAnswer().getPrize().getDescription());
        } else {
            System.out.println("Game over,Tou final score :" + playScore);

        }
    }

    void checkAnswer(int answerIndex) {
        Question cureentQuestion = questions[currentQuestionIndex];
        Answer selectedAnswer = cureentQuestion.getAnswers()[answerIndex];
        if (cureentQuestion.checkAnswer(answerIndex)) {
            System.out.println("Correct!You earned a point!");
            playScore++;
        } else {
            System.out.println("Incorrect.The correct answer was:" + cureentQuestion.getCorrectAnswer().getAnswerText());
            currentQuestionIndex++;
        }
    }

}
