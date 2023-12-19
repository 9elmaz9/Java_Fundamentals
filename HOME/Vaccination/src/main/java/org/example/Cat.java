package org.example;

import java.util.Map;

public class Cat extends Animal {

    private boolean hasLongNails;

    public Cat(boolean hasLongNails) {
        this.hasLongNails = hasLongNails;
    }

    public Cat(Map<Disease, Boolean> isVaccinated, boolean isClean, int age, String name, int animalNumber, boolean hasLongNails) {
        super(isVaccinated, isClean, age, name, animalNumber);
        this.hasLongNails = hasLongNails;
    }

    public Cat() {

    }

    public boolean isHasLongNails() {
        return hasLongNails;
    }

    public void setHasLongNails(boolean hasLongNails) {
        this.hasLongNails = hasLongNails;
    }

    // Implementing Treatable Interface
    @Override
    public void treatAnimal() {
        super.treatAnimal(); // Call the base class method
        hasLongNails = false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", hasLongNails=" + hasLongNails +
                ", isVaccinated=" + getIsVaccinated() +
                ", isClean=" + isClean() +
                '}';
    }
}
