package GameNight;

abstract class AbstractGame {
    //atributs
    Question[] questions;
    int currentQuestionIndex;
    int playScore;
    //int answerIndex;

    /*AbstractGame(Question[] questions, int currentQuestionIndex, int playScore) {
        this.questions = questions;
        this.currentQuestionIndex = currentQuestionIndex;
        this.playScore = playScore;
    }*///31.10

    abstract void startGame();

    public void displayQuestion() {
        Question currentQuestion = questions[currentQuestionIndex];
        System.out.println(currentQuestion.getQuestionText());
        Answer[] answers = currentQuestion.getAnswers();
        for (int i = 0; i < answers.length; i++) {
            System.out.println(i + 1 + ":" + answers[i].getAnswerText());

        }
    }


    void displayPrize() {

        System.out.println(" Congrat . You won : " + questions[currentQuestionIndex-1].get().getLeadsToPrize().getName());

        System.out.println("Prize description :" + questions[currentQuestionIndex].getCorrectAnswerIndex().getLeadsToPrize().getDescription());
    }

    void checkAnswer(int answerIndex) {
        //Question currentQuestionIndex = questions[currentQuestionIndex];
       //Answer selectedAnswer = currentQuestionIndex.getAnswers()[answerIndex];
    }
}









