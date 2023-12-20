package org.example.IntecBrusselBE;

import java.util.*;

public class AnimalShelter {
    private List<Animal> animals = new ArrayList<>();
    private int animalId;


    public AnimalShelter() {
    }

    //default
    public AnimalShelter(int animalId) {
        this.animalId = animalId;
    }


    public List<Animal> getAnimals() { // niet nodig
        return animals;
    }

    public void setAnimals(List<Animal> animals) { //niet nodig
        this.animals = animals;
    }

    public int getAnimalId() { // yes
        return animalId;
    }

    public void setAnimalId(int animalId) { // yes
        this.animalId = animalId;
    }


//   // Constructor
//   public AnimalShelter() {
//       animals = new ArrayList<>();
//       animalId = 1; // starting animalId
//   }


// @Override
// public boolean equals(Object o) {
//     if (this == o) return true;
//     if (!(o instanceof AnimalShelter)) return false;
//     AnimalShelter that = (AnimalShelter) o;
//     return getAnimalId() == that.getAnimalId() && Objects.equals(getAnimals(), that.getAnimals());
// }

// @Override
// public int hashCode() {
//     return Objects.hash(getAnimals(), getAnimalId());
// }


    //methoden


    //1
    public void printAnimals() {
        // for (Animal animal : animals) {
        //    System.out.println(animal);
        //    }
        animals.forEach(animal -> System.out.println(animal));
    }

    //2        sorteert de dieren volgens hun natuurlijke volgorde, dit is volgens hun animalNumber
    public void sortAnimals() {
        animals.sort(Comparator.comparingInt(Animal::getAnimalNumber));
        System.out.println(animals);
    }

    //3         sortAnimalsByName() sorteert de dieren op naam.
    public void sortAnimalByName() {
        animals.sort(Comparator.comparing(Animal::getName));
        System.out.println(animals);
    }

    //4           sorteert de dieren op leeftijd
    public void sortAnimalByAge() {
        animals.sort(Comparator.comparing(Animal::getAge));
        System.out.println(animals);
    }

    //5           print alle dieren af die niet gevaccineert zijn voor een opgegeven ziekte
    public void printAnimalsNotVaccinated(Disease disease) {
        for (Animal animal : animals) {
            //if (!animal.getIsVaccinated()(disease)) {
            if (animal.getIsVaccinated().get(disease) == false) {
                System.out.println(animal.getName() +  " Id number " + animal.getAnimalNumber() + " is not vaccinated " + disease);
            } else {
                System.out.println(animal.getName() + " YES" + animal.getAnimalNumber() + "vaccinated " + disease);
            }
        }
    }

    //6          findAnimal(int) zoek dier op dierennummer
    public Animal findAnimal(int animalId) {
        for (Animal animal : animals) {
            if (animal.getAnimalNumber() == animalId) {
                return animal;
            }
            // if (animalId == getAnimalId()) {
            //     System.out.println("You find animal with " + animalNumber);
            //     // }
        }
        return null; // not found
    }

    //7          zoek dier op dierennaam
    public Animal findAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        // if(animals.contains(name)== name.equals(name)){
        //     System.out.println("You find animal with"+ name);
        // }
        return null; // not found
    }

    //8    behandel opgegeven dier  // лечим указанное животное
    public void treatAnimal(int animalId) {
        Animal animal = findAnimal(animalId);
        if (animal != null) {
            animal.treatAnimal();

            // for(Animal animal:animals){
            //     if(animal.getAnimalNumber()==animalId){
            //         animal.treatAnimal();
            //     }
        }
    }

    //9           behandel opgegeven dier
    public void treatAnimal(String name) {
        Animal animal = findAnimal(name);
        if (animal != null) {
            animal.treatAnimal();
        }
    }

    //10      behandel alle dieren
    public void treatAllAnimals() {
        for (Animal animal : animals) {
            animal.treatAnimal();

        }
    }

    //11    geef het oudste dier terug
    public Animal findOldestAnimal() {
        if (animals.isEmpty()) {
            return null; // no animals in shelter
        }
        return Collections.max(animals, Comparator.comparingInt(Animal::getAge));
    }

    //12    geef het aantal dieren terug
    public int countAnimals() {
        //geef het aantal dieren terug
        return animals.size();
    }

    //13
    //voeg een dier toe aan de lijst van  Daarna verhoog je de animalId met 1. Zo krijgt elke
    // animal een unieke nummer.
    public void addAnimal(Animal animal) { //AnimalId.
        //  animal.setAnimalNumber(animalId);  woooork
        //  animalId++;
        //  animals.add(animal);

        animals.add(animal);
        animal.treatAnimal();
        animal.setAnimalNumber(animalId += 1);
    }
}




