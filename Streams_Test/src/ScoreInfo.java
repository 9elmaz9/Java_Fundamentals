import java.util.ArrayList;

public class ScoreInfo {
    //properties
    int score ;
    ArrayList<Student> student;


    public ScoreInfo(int score, ArrayList<Student> student) {
        this.score = score;
        this.student = student;
    }

    @Override //method
    public String toString() {
        return "ScoreInfo{" + "score=" + score + ", student=" + student + '}';
    }
}
