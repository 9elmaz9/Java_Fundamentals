package Les1.CarVehicle.Oefening1;

public class PolymorphismExample {
    public static void main(String[] args) {
        //Usung toString()
        //перетворення рядкового об’єкта в рядок.

        System.out.println("*** Using toString() ***");
        Animal genericAnimal = new Animal("BiB", 2);
        Cat breedCat = new Cat("Lily", 2.5, "Sphinx");
        System.out.println(genericAnimal);
        System.out.println(breedCat);


        //using equals()
        //порівнює два рядки та повертає true, якщо рядки рівні, і false,
        System.out.println("*** Using equals() ***");
        Animal anotherGenericAnimal = new Animal("Bob", 5);
        System.out.println("Are generic animals aqual?" + genericAnimal.equals((anotherGenericAnimal)));



        // hashCode()
        //повертає ціле значення, згенероване алгоритмом хешування

        System.out.println("*** Using hashCode() ***");
        System.out.println("HashCode of generic animal :"+genericAnimal.hashCode());



        //Runtime polymorphism ()
        //динамічне відправлення методів,перевизначеного методу вирішується динамічно під час виконання, а не під час компіляції
        System.out.println("*** Runtime polymorphism ***");
        Animal polyMorphicAnimal=new Cat("Mimi",3 , "Munchkin");
        polyMorphicAnimal.makeSound();


        //виклик makeSound() класу Cat через поліморфізм часу виконання
        //call makeSound() of Cat class due to runtime polymorphizm


    }
}
