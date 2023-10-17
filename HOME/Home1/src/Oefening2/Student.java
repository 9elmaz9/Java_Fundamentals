package Oefening2;

public class Student extends Person {

        String studentId;

        // constructor of the Student class
        public Student(String name, int age, String studentId) {
            // constructor chaining to the superclass (Person)
            super(name, age);
            this.studentId = studentId;
        }
    }

