package Car;


public class Car extends Vehicle {
    /*
     *Dit zal niet worden uitgevoerd.Als we de this() uit comment halen en de ander in comment zetten in de
     *Vehicle class kun je het veerschil zien.Vergeet niet dat er altijd 1 constructor zonder een thuis() moet zijn
     *
     */
    //Atributs
    private String brandName = "Audi";

    //Properties

    public Car() {
//This will be executed third
        super();
        System.out.println("Car construcror");

    }
}

