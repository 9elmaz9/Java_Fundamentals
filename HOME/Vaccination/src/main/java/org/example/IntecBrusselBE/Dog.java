package org.example.IntecBrusselBE;

import java.util.Map;
import java.util.Objects;

public class Dog extends Animal{
    private boolean hasFoulBreath;

    public Dog(Map<Disease, Boolean> isVaccinated, boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isVaccinated, isClean, age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    public boolean isHasFoulBreath() {
        return hasFoulBreath;
    }

    public void setHasFoulBreath(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return isHasFoulBreath() == dog.isHasFoulBreath();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isHasFoulBreath());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "hasFoulBreath=" + hasFoulBreath +
                '}';
    }
}
