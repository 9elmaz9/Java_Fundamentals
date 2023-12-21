package org.example.IntecBrusselBE;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal  implements Treatable, Vaccinateable {
    private Map<Disease, Boolean> isVaccinated= new HashMap<>(){
        {put(Disease.POLIO,false);put(Disease.HEPATITISA,false);put(Disease.FLUE,false);put(Disease.CHICKENPOCKS,false);}};

    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;



    public Animal() {

    }

    // Constructors
    //  public Animal() {
    //      isVaccinated = new HashMap<>();
    //      for (Disease disease : Disease.values()) {
    //          isVaccinated.put(disease, false);
    //      }
    //  }
    public Animal(boolean isClean, int age, String name, int animalNumber) {
        this.isVaccinated = isVaccinated;
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }




    //  public Animal(List<Animal> animals, int animalId, Map<Disease, Boolean> isVaccinated) {
    //      super(animals, animalId);
    //      this.isVaccinated = isVaccinated;
    //  }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Disease disease) {
        isVaccinated.replace(disease, false);
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) { // niet nodig
        isClean = clean;
    }

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }


    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }



// zorgt ervoor dat een animal clean gemaakt wordt.
    @Override
    public void treatAnimal() { // realizyetsya tyt !
        isClean = true;
        System.out.println("Animal is treated" + isClean);
    }

    //() zal een dier vaccineren voor een bepaalde ziekte
    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.replace(disease, true);

    }

    @Override
    public String toString() {
        return
                "isVaccinated= " + isVaccinated +
                ", isClean= " + isClean +
                ", age =" + age +
                ", name='" + name + '\'' +
                ", animalNumber= " + animalNumber +
                '}';
    }
}




