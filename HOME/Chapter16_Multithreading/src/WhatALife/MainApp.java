package WhatALife;

public class MainApp {
    public static void main(String[] args) {

        Person person = new Person("Jerry", 70, 5000);
        person.startLife();

       Person mama = new Person("Lisa", 35, 6500);
       Person papa = new Person("Bob", 39, 5300);
       Person kind1 = new Person("Anna", 4, 3300);
       Person kind2 = new Person("John", 9, 4000);

       mama.startLife();
       papa.startLife();
       kind1.startLife();
       kind2.startLife();



    }
}
