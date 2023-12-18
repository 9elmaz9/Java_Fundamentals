package org.example.IntecBrusselBE;

import java.util.Map;
import java.util.Objects;

public class Cat extends Animal{
    private boolean hasLongNails;

    public Cat(Map<Disease, Boolean> isVaccinated, boolean isClean, int age, String name, int animalNumber, boolean hasLongNails) {
        super(isVaccinated, isClean, age, name, animalNumber);
        this.hasLongNails = hasLongNails;
    }

    public boolean isHasLongNails() {
        return hasLongNails;
    }

    public void setHasLongNails(boolean hasLongNails) {
        this.hasLongNails = hasLongNails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return isHasLongNails() == cat.isHasLongNails();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isHasLongNails());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hasLongNails=" + hasLongNails +
                '}';
    }
}
