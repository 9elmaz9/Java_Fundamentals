package Deque;

public class Person {
    String name;
    Gender gender;

    @Override
    public String toString() {
        return name;
    }

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;


    }

    public enum Gender {

        MALE,
        FEMALE;
    }
}
