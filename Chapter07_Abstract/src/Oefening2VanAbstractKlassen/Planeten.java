package Oefening2VanAbstractKlassen;

//super class
abstract class Planeten {
    // Конечная переменная=variable для названия небесного тела
    final String NAME;

    // Constructor to initialize the name
    public Planeten(String name) {
        this.NAME = name;
    }

    //creeren calculateArea om radius te bereiken
    final double CALCULATEPERIMETER(double radius) { // unaltered
        return 2 * Math.PI * radius; // Formula for calculating radius

    }
}


//creeren calculateArea om radius te bereiken
//double calculateArea() {
//return 0;

