package GameNight;

public class Answer {
    private  String text;
    private Prize leadsToPrize;

    Answer(String text,Prize leadsToPrize){
        this.text=text;
        this.leadsToPrize=leadsToPrize;
    }
    String getAnswerText(){
    return text;
    }
    Prize getPrize(){
        return leadsToPrize;
    }
}