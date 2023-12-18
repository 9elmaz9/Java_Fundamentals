package org.example.IntecBrusselBE;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AnimalShelter {
    private List<Animal> animals;
    private int animalId;
    private String animalCount;


    //default
    public AnimalShelter(List<Animal> animals, int animalId) {
        this.animals = animals;
        this.animalId = animalId;
    }

    public AnimalShelter(Map<Disease, Boolean> diseases, boolean b, int i, String s, int i1) {
    }

    public AnimalShelter(String cat, int animalId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnimalShelter)) return false;
        AnimalShelter that = (AnimalShelter) o;
        return getAnimalId() == that.getAnimalId() && Objects.equals(getAnimals(), that.getAnimals());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnimals(), getAnimalId());
    }


    //methoden


    //1
    public void printAnimals() {
        // print alle dieren

        // improviz
        // System.out.println("Animals" + getAnimalId()+":"+getAnimals());


    }


    //2
    public void sortAnimals() {

        //  sorteert de dieren volgens hun natuurlijke volgorde, dit is volgens hun animalNumber
        //сортирует животных в соответствии с их естественным порядком, то есть по их номеру животного.

    }

    //3
    public void sortAnimalByName() {
        //sortAnimalsByName() sorteert de dieren op naam.
    }


    //4
    public void sortAnimalByAge() {
        // sorteert de dieren op leeftijd
    }

    //5
    public void printAnimalsNotVaccinated(Disease disease) {
        //print alle dieren af die niet gevaccineert zijn voor een opgegeven ziekte
        //выводит всех животных, которые не были вакцинированы от указанного заболевания.

    }

    //6
    public Animal findAnimal(int animalNumber) {

        //findAnimal(int) zoek dier op dierennummer
        //найти животное по номеру животного
        return null;
    }


    //7
    public Animal findAnimal(String name) {
        //zoek dier op dierennaam
        ////ищем животное по названию животного

        return null;
    }

    //8
    public void treatAnimal(int animalNumber) {
        // behandel opgegeven dier
        // лечим указанное животное

    }

    //9
    public void treatAnimal(String name) {
        // behandel opgegeven dier
        // лечим указанное животное
    }

    //10
    public void treatAllAnimals() {
        //behandel alle dieren
        // лечить всех животных
    }

    //11
    public Animal findOldestAnimal() {
        //geef het oudste dier terug
        //вернуть самое старое животное
        return null;
    }

    //12
    public int countAnimals() {
        //geef het aantal dieren terug
        //вернуть количество животных
        return 0;
    }

    //13
    public void addAnimal(Animal animal) {

        //voeg een dier toe aan de lijst van
        //animals. De animalNumber van de animal krijgt de waarde van
        //animalId. Daarna verhoog je de animalId met 1. Zo krijgt elke
        //animal een unieke nummer.


        //добавить животное в список животных.
        // AnimalNumber животного получает значение AnimalId.
        // Затем вы увеличиваете AnimalId на 1. Это дает каждому животному уникальный номер.

    }









    // extra
// The UML doesn't have this method
    public void displayAnimalList() {
    }
}




//extra
// public String getAnimalCount() {
//     return animalCount;
//}
//}//



