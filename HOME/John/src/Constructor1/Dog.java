package Constructor1;

public class Dog {
    String name; // default constructor
    int age;

    public Dog(String name) { // String , int : void - haven't retern type
        //name = " Kramer";
        // name=name ;
        this.name = name; // it is name
    }

    public Dog(int age) { // String , int : void - haven't retern type
        this.age = age;
    }

    public Dog(String name, int age) { // String , int : void - haven't retern type
        this.age = age;
        this.name = name;
    }
}
