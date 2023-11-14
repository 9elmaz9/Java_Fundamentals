public class ScoreInfo {
    //properties
    int score ;
    String student;

    public ScoreInfo(int score, Student student) { // constructor
        this.score = score;
        this.student = student;
    }

    @Override //method
    public String toString() {
        return "ScoreInfo{" + "score=" + score + ", student=" + student + '}';
    }
}
