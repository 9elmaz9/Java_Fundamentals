package org.example.IntecBrusselBE;

import java.util.Map;
import java.util.Objects;

public class Cat extends Animal{
    private boolean hasLongNails;

    public Cat( boolean isClean, int age, String name, int animalNumber, boolean hasLongNails) {
        super( isClean, age, name, animalNumber);
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
     // return "Cat{" +
     //         "name='" + getName() + '\'' +
     //         ", age=" + getAge() +
     //         ", hasLongNails=" + hasLongNails +
     //         ", isVaccinated=" + getIsVaccinated() +
     //         ", isClean=" + isClean() +
     //
        //         '}';
        //return "Cat : " + getName()+ super.toString()+" hasLongNails "+hasLongNails + ", getIsVaccinated"+ getIsVaccinated();
        return "Cat  name: " + getName()+ "age : "+getAge()+ "Animal number : " +getAnimalNumber()+" , hasLongNails-"+hasLongNails + " , isClean-"+isClean() + ", getIsVaccinated"+ getIsVaccinated();
    }
}
