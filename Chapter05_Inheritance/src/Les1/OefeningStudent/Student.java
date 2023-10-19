package Les1.OefeningStudent;

public class Student extends Person {
    String studentId;

    // onstructor of the Student class
    public Student(String name, int age, String studentId) {
        // constructor chaining to the superclass (Person)
        super(name, age);
        this.studentId = studentId;
    }
}



