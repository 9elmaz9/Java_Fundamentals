package org.example.IntecBrusselBE;

import org.example.IntecBrusselBE.AnimalShelter;
import org.example.IntecBrusselBE.Cat;

import java.util.*;
//APP
public class Main {
    public static void main(String[] args) {

        AnimalShelter animalShelter = new AnimalShelter(0);


        Cat MANGO = new Cat(true, 4, "MANGO ", 1, true);
        Dog dog = new Dog(true, 15, "REX ", 2, true);
        Monkey ZEUS = new Monkey(true, 5, "ZEUS ", 3, true);
        Monkey monkey2 = new Monkey(true, 4, "BUSTER ", 4, true);
        Monkey monkey1 = new Monkey(true, 16, "PEPPER ", 5, true);
        Dog dog1 = new Dog(true, 2, "ATHENA ", 6, true);
        Cat cat4 = new Cat(true, 7, "PEARL ", 7, true);
        Dog dog2 = new Dog(true, 8, "SNOWY ", 8, true);
        Cat cat3 = new Cat(true, 21, "CLAW ", 9, true);
        Cat cat6 = new Cat(true, 11, "HULK ", 10, true);


        animalShelter.addAnimal(MANGO);
        animalShelter.addAnimal(dog);
        animalShelter.addAnimal(ZEUS);
        animalShelter.addAnimal(monkey2);
        animalShelter.addAnimal(monkey1);
        animalShelter.addAnimal(dog1);
        animalShelter.addAnimal(cat4);
        animalShelter.addAnimal(dog2);
        animalShelter.addAnimal(cat3);
        animalShelter.addAnimal(cat6);


        System.out.println("All Animals in the Shelter:");
        animalShelter.printAnimals();

        System.out.println("\nAnimals Sorted  by Id:");
        animalShelter.sortAnimals();
        animalShelter.printAnimals();

        System.out.println("\nAnimals Sorted by Name:");
        animalShelter.sortAnimalByName();
        animalShelter.printAnimals();


        System.out.println("\nAnimals Sorted by Age:");
        animalShelter.sortAnimalByAge();
        animalShelter.printAnimals();
//

        System.out.println("\nTreating All Animals:"+animalShelter.getAnimalId());
        animalShelter.treatAllAnimals();
        animalShelter.printAnimals();

        System.out.println("\nAnimals Not Vaccinated for FLUE:");
        animalShelter.printAnimalsNotVaccinated(Disease.FLUE);

        System.out.println("\nFinding Animal by ID (3)");
        Animal foundById=animalShelter.findAnimal(3);
        System.out.println(foundById);
        //animalShelter.findAnimal(3);
      // System.out.println("\nFinding Animal by Number (Animal 3):"+animalShelter); // +animalShelter.findAnimal(77)
      // Animal foundByNumber = animalShelter.findAnimal(3);
      // System.out.println(foundByNumber);

        System.out.println("\nFinding Animal by Name (BUSTER):");
        //Animal foundByName = animalShelter.findAnimal(monkey2.getName());
        Animal foundByName=animalShelter.findAnimal("BUSTER");
        System.out.println(foundByName);

        System.out.println("\nTreating Animal by ID ( 5):");
        animalShelter.treatAnimal(5);
        animalShelter.printAnimals();

        System.out.println("\nTreating Animal by Name (MANGO):");
        animalShelter.treatAnimal("MANGO");
        animalShelter.printAnimals();

        System.out.println("\nFindMing Oldest Animal:");
        Animal oldestAnimal = animalShelter.findOldestAnimal();
        if (oldestAnimal != null) {
            System.out.println(oldestAnimal);
        }

        System.out.println("\nTotal Number of Animals: " + animalShelter.countAnimals());
    }


}

