package org.example.IntecBrusselBE;

import java.util.Map;
import java.util.Objects;

public class Monkey  extends  Animal{
    private boolean isHyperActive ;

    public Monkey(Map<Disease, Boolean> isVaccinated, boolean isClean, int age, String name, int animalNumber, boolean isHyperActive) {
        super(isVaccinated, isClean, age, name, animalNumber);
        this.isHyperActive = isHyperActive;
    }

    public boolean isHyperActive() {
        return isHyperActive;
    }

    public void setHyperActive(boolean hyperActive) {
        isHyperActive = hyperActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monkey)) return false;
        if (!super.equals(o)) return false;
        Monkey monkey = (Monkey) o;
        return isHyperActive() == monkey.isHyperActive();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isHyperActive());
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "isHyperActive=" + isHyperActive +
                '}';
    }
}
