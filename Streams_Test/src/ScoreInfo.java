import java.util.ArrayList;

public class ScoreInfo {
    //properties
    private int score;
    private Student student;


    public ScoreInfo(int score, Student student) {
        this.score = score;
        this.student = student;
    }

    @Override //method
    public String toString() {
        return "ScoreInfo{" + "score=" + score + ", student=" + student + '}';
    }
}
