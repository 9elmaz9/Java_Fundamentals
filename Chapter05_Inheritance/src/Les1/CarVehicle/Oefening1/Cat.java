package Les1.CarVehicle.Oefening1;

public class Cat extends Animal {

    private String breed; // voor dit  klass

    public Cat(String name ,double age, String breed){
        super(name,age); // eerst aanrop aan Animal super class  dit eigenschappen
        this.breed=breed; // allen hier, het is nieuwe voor Cat class+ niet extends uit Animal
    }

    @Override // method voor makeSounds
    public void makeSound() {
        super.makeSound();
        System.out.println("Miy miy");
    }
}
