package Example1;

//super class
public class MainApp {
    public static void main(String[] args) {

        // nuiewe object te maken
        Animal myAnimal = new Animal(); // deze komt van animal
        myAnimal.animalSound();

        // my referanst type is cat  , komt van Cat class
        Animal myCat = new Cat();
        myCat.animalSound();

        Animal myDuck=new Duck(); //deze komt van Duck class , referance type is Animal
        myDuck.animalSound();

    }
}
