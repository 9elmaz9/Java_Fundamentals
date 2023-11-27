package Les1.OefeningStudent;

public class Main {
    public static void main(String[] args) {
        // create person
        Person person1 = new Person("Mariana", 28);
        Student student1 = new Student("Jack", 26, "S12345");

        // the attributes of these persons
        System.out.println("Person1: " + person1.name + ", " + person1.age + " years old");
        System.out.println("Student1: " + student1.name + ", " + student1.age + " years old, Student ID: " + student1.studentId);
    }
}

