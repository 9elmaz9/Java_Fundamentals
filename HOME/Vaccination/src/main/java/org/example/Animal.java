package org.example;

import java.util.HashMap;
import java.util.Map;

public class Animal implements Vaccinateable,Treatable {
    private Map<Disease, Boolean> isVaccinated;
    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;

    // Constructors
    public Animal() {
        isVaccinated = new HashMap<>();
        for (Disease disease : Disease.values()) {
            isVaccinated.put(disease, false);
        }
    }

    public Animal(Map<Disease, Boolean> isVaccinated, boolean isClean, int age, String name, int animalNumber) {
        this.isVaccinated = isVaccinated;
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }




    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }


    //-------------
    public boolean isVaccinated(Disease disease) {
        return isVaccinated.getOrDefault(disease, false);
    }

    public void setVaccinated(Disease disease, boolean value) {
        isVaccinated.put(disease, value);
    }

    //// QUESTIO?
    // Implementing Treatable Interface
    @Override
    public void treatAnimal() {
        isClean = true;
    }


    // Implementing Vaccinateable Interface
    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.put(disease, true);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isVaccinated=" + isVaccinated +
                ", isClean=" + isClean +
                '}';
    }

    // public boolean isVaccinated(Disease disease) {
 //     return false;
 // }



    // new version


 // // Implementing Vaccinateable Interface
 // @Override
 // public void vaccinateAnimal(Disease disease) {
 //     setVaccinated(disease, true);
 // }

 // // Implementing Treatable Interface
 // @Override
 // public void treatAnimal() {
 //     setClean(true);
 // }



// public boolean isClean() {
//     return isClean;
// }

// public void setClean(boolean clean) {
//     isClean = clean;
// }
}
