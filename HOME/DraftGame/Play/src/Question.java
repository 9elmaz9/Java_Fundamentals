 class Question {


    private String text ;
    private Answer[] answers;
    private int correctAnswerIndex;

    Question(String text,Answer[] answers,int
             correctAnswerIndex){
        this.text=text;
        this.answers=answers;
        this.correctAnswerIndex=correctAnswerIndex;
    }
    String getQuestionText (){
        return text;
    }

    Answer[]getAnswers(){
        return answers;
    }

    Answer getCorrectAnswer(){
        return answers[correctAnswerIndex];
    }
    boolean checkAnswer(int answerIndex){
        return answerIndex==correctAnswerIndex;
    }
}
