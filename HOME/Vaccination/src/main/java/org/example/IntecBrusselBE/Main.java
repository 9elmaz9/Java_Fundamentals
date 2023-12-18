package org.example.IntecBrusselBE;

import org.example.IntecBrusselBE.AnimalShelter;
import org.example.IntecBrusselBE.Cat;

import java.util.*;

//Maak een app aan waarin je 10 dieren aanmaakt en toevoegt aan een zelfgemaakte animalshelter. Test alle
//methoden van de animalshelter klasse.

//Создайте приложение, в котором вы создадите 10 животных и добавите их в самодельный приют для животных.
//Испытайте все методы класса приюта для животных.

public class Main {
    public static void main(String[] args) {
        AnimalShelter animalShelter;
        animalShelter = new AnimalShelter("g",12);
//AnimalShelter animalShelter = new AnimalShelter("g",12); - dezelfde

        //dieren
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            Map<Disease, Boolean> diseases = new HashMap<>();
            diseases.put(Disease.CHICKENPOCKS, false);
            diseases.put(Disease.FLUE,false);
            diseases.put(Disease.HEPATITISA,false);
            diseases.put(Disease.POLIO,false);



            Animal animal = new Animal(diseases, true, i, "Animal" + i, i * 100);

            animal.addAnimal(new Animal(new HashMap<>(), false, 3, "Cat", 101));
            animal.addAnimal(new Animal(new HashMap<>(), true, 5, "Dog", 102));
            animal.addAnimal(new Animal(new HashMap<>(), false, 6, "Raccoon", 103));
            animal.addAnimal(new Animal(new HashMap<>(), true, 13, "Bear", 104));
            animal.addAnimal(new Animal(new HashMap<>(), false, 8, "Tiger", 105));
            animal.addAnimal(new Animal(new HashMap<>(), true, 4, "Koala", 106));
            animal.addAnimal(new Animal(new HashMap<>(), false, 9, "Beaver", 107));
            animal.addAnimal(new Animal(new HashMap<>(), true, 14, "Horse", 108));
            animal.addAnimal(new Animal(new HashMap<>(), false, 3, "Goat", 109));
            animal.addAnimal(new Animal(new HashMap<>(), true, 2, "Rabbit ", 110));

        }

        for (Animal animal : animals) {
            animalShelter.addAnimal(animal);

        }


        // test methoden
        System.out.println(" amount dieren "+ animalShelter.countAnimals());
        System.out.println(" list animal ");
        animalShelter.printAnimals();
    }
}