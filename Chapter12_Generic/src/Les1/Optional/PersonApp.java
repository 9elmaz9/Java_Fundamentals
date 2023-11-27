package Les1.Optional;

import java.util.Optional;

public class PersonApp {
    public static void main(String[] args) {

        Person person= Person.getPerson("bob");
        System.out.println(person.getName());

        /* Person person2= Person.getPerson("sasha");
        Sustem.out.println(person2.getName()); - get error, bc this name is not in the list
       */

        Optional<Person> personOptional= Person.getPersonOptional("jean");
        System.out.println( personOptional.isPresent()  ? personOptional.get().getName() : "" );
        Optional<Person> personOptional2 = Person.getPersonOptional("sasha");
        System.out.println( personOptional2.isPresent()  ? personOptional2.get().getName() : "" );

    }



}
