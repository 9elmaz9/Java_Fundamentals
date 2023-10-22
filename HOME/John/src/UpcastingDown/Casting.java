package UpcastingDown;

public class Casting {
    public static void main(String[] args) {
        // Animal myAnimal = (Animal) new Dog();  //UPCASTING - call all animal tipe
        Animal myAnimal = new Dog(); // Animal myAnimal - referens type
        // myAnimal.growl(); // we dont have anu Dog atrhtibuts , only animal
        doAnimalStuff(myAnimal);


        //Dog myDog = new Dog();
        // doAnimalStuff(myDog);
    }

    public static void doAnimalStuff(Animal animal) { //doesn't matter which animal call
        animal.makeNouse();

        if (animal instanceof Dog) { // true = we know our obj actually is a dog
            //animal.growl(); // neen
            Dog myDog = (Dog) animal; //DOWNCASTING - this animal -is a dog
            myDog.growl(); // we can call growl() when we do downcasting
        }
    }

}
