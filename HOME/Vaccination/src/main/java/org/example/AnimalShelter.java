package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnimalShelter {

    private List<Animal> animals;
    private int animalId;


    public AnimalShelter(List<Animal> animals, int animalId) {
        this.animals = animals;
        this.animalId = animalId;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    // Constructor
    public AnimalShelter() {
        animals = new ArrayList<>();
        animalId = 1; // starting animalId
    }

    // Other Methods

    /**
     * Adds an animal to the shelter.
     * The animal's animalNumber is set to the current animalId, and animalId is incremented.
     *
     * @param animal The animal to be added.
     */
    public void addAnimal(Animal animal) {
        animal.setAnimalNumber(animalId);
        animalId++;
        animals.add(animal);
    }

    /**
     * Prints information about all animals in the shelter.
     */
    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    /**
     * Sorts the animals in the shelter based on their natural order (animalNumber).
     */
    public void sortAnimals() {
        animals.sort(Comparator.comparingInt(Animal::getAnimalNumber));
    }

    /**
     * Sorts the animals in the shelter alphabetically by their names.
     */
    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
    }

    /**
     * Sorts the animals in the shelter by their ages.
     */
    public void sortAnimalsByAge() {
        animals.sort(Comparator.comparingInt(Animal::getAge));
    }

    /**
     * Prints information about animals that are not vaccinated for a specified disease.
     *
     * @param disease The disease for which to check vaccination status.
     */
    public void printAnimalsNotVaccinated(Disease disease) {
        for (Animal animal : animals) {
            if (!animal.isVaccinated(disease)) {
                System.out.println(animal);
            }
        }
    }

    /**
     * Finds and returns an animal by its animalNumber.
     *
     * @param animalNumber The animal number to search for.
     * @return The found animal or null if not found.
     */
    public Animal findAnimal(int animalNumber) {
        for (Animal animal : animals) {
            if (animal.getAnimalNumber() == animalNumber) {
                return animal;
            }
        }
        return null; // Animal not found
    }

    /**
     * Finds and returns an animal by its name.
     *
     * @param name The name of the animal to search for.
     * @return The found animal or null if not found.
     */
    public Animal findAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null; // Animal not found
    }

    /**
     * Treats an animal based on its animalNumber.
     *
     * @param animalNumber The animal number of the animal to be treated.
     */
    public void treatAnimal(int animalNumber) {
        Animal animal = findAnimal(animalNumber);
        if (animal != null) {
            animal.treatAnimal();
        }
    }

    /**
     * Treats an animal based on its name.
     *
     * @param name The name of the animal to be treated.
     */
    public void treatAnimal(String name) {
        Animal animal = findAnimal(name);
        if (animal != null) {
            animal.treatAnimal();
        }
    }

    /**
     * Treats all animals in the shelter.
     */
    public void treatAllAnimals() {
        for (Animal animal : animals) {
            animal.treatAnimal();
        }
    }

    /**
     * Finds and returns the oldest animal in the shelter.
     *
     * @return The oldest animal or null if there are no animals in the shelter.
     */
    public Animal findOldestAnimal() {
        if (animals.isEmpty()) {
            return null; // No animals in the shelter
        }
        return Collections.max(animals, Comparator.comparingInt(Animal::getAge));
    }

    /**
     * Counts and returns the total number of animals in the shelter.
     *
     * @return The total number of animals.
     */
    public int countAnimals() {
        return animals.size();
    }
}


