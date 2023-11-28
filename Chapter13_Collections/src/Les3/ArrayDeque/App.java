package Les3.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) {
        Deque<Person> persons = new ArrayDeque<>();

        persons.offerFirst(new Person("Jery", Person.Gender.MALE));
        persons.offerFirst(new Person("John", Person.Gender.MALE));
        persons.offerFirst(new Person("Matt", Person.Gender.MALE));
        persons.offerLast(new Person("Mary", Person.Gender.FEMALE));
        persons.offerLast(new Person("Suzan", Person.Gender.FEMALE));
        persons.offerLast(new Person("Katy", Person.Gender.FEMALE));


        Person person = persons.pollFirst();


        while (person != null) {
            System.out.println("Couples are " + person + "and " + persons.pollLast() + "\n");
            person = persons.pollFirst();

        }
    }
}
