package org.example.IntecBrusselBE;

public class Monkey  extends  Animal{
    private boolean isHyperActive ;

    public Monkey(boolean isClean, int age, String name, int animalNumber, boolean isHyperActive) {
        super(isClean, age, name, animalNumber);
        this.isHyperActive = isHyperActive;
    }

    public Monkey() {

    }

    public boolean isHyperActive() {
        return isHyperActive;
    }

    public void setHyperActive(boolean hyperActive) {
        isHyperActive = hyperActive;
    }

    // Implementing Treatable Interface
    @Override
    public void treatAnimal() {
        super.treatAnimal(); // Call the base class method
        isHyperActive = false;
    }

    @Override
    public String toString() {
        return "Monkey name:" +getName()+ ",age:"+getAge()+ " ,Animal number:" +getAnimalNumber()+" , isHyperActive- "+isHyperActive + " , isClean-"+isClean() + ", getIsVaccinated "+ getIsVaccinated();

    }
}
