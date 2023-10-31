package GameNight;

public class Question {
    // atributes
    private String text;
    Answer[] answers;
    private int correctAnswerIndex;

    //Methods

    Question(String text, Answer[] answers, int correctAnswerIndex) {
        this.text = text;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionText() {
        return text;
    }

    public Answer[] getAnswer() {
        return answers;
    }

    Answer getCorrectAnswerIndex() {
        return answers[correctAnswerIndex];
    }
    boolean checkAnswer(int answerIndex){
        return answerIndex==correctAnswerIndex;
    }
}

