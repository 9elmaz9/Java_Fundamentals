package GameNight;

abstract class AbstractGame {

    Question[] questions;
    int currentQuestionIndex;
    int playScore;

    abstract void startGame();

    public  void displayQuestion() {
        Question currentQuestion = questions[currentQuestionIndex];
        System.out.println(currentQuestion.getQuestionText());
        Answer[] answers= currentQuestion.getAnswer();
        for (int i=0 ; i< answers.length ;i++){
            System.out.println("i:"+i +":"+answers[i].getAnswerText());

        }


    }


    public abstract void displayPrize();


}
