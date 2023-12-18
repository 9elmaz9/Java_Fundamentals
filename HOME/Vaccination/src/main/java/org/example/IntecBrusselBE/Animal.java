package org.example.IntecBrusselBE;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Animal extends AnimalShelter implements Treatable, Vaccinateable {
    private Map<Disease, Boolean> isVaccinated;
    private boolean isClean;
    private int age;
    private String name;
    private  int animalNumber;

    public Animal(List<Animal> animals, int animalId) {
        super(animals, animalId);
    }

    public Animal(Map<Disease, Boolean> diseases, boolean b, int i, String s, int i1) {
        super(diseases, b, i, s, i1);
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

    public int getEga() {
        return age;
    }

    public void setEga(int ega) {
        this.age = ega;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return isClean() == animal.isClean() && getEga() == animal.getEga() && getAnimalNumber() == animal.getAnimalNumber() && Objects.equals(getIsVaccinated(), animal.getIsVaccinated()) && Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsVaccinated(), isClean(), getEga(), getName(), getAnimalNumber());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "isVaccinated=" + isVaccinated +
                ", isClean=" + isClean +
                ", ega=" + age +
                ", name='" + name + '\'' +
                ", animalNumber=" + animalNumber +
                '}';
    }



    @Override
    public void treatAnimal() { // realizyetsya tyt !

        //treatAnimal() zorgt ervoor dat een animal clean gemaakt wordt. Indien je aan het werken bent met een
        //cat, dog of monkey, zorg er dan voor dat de treatAnimal methode ook de hyperactivity, de longnails en de
        //foulbreath problemen oplost. (op false zet)

        //treatAnimal() гарантирует, что животное будет очищено. Если вы работаете с
        //кошку, собаку или обезьяну, убедитесь, что метод treatAnimal также лечит гиперактивность,
        // длинные ногти и решает проблемы со зловонным запахом изо рта. (установлено значение ложь)


    }


    @Override // etot toze realizyetsya tyt
    public void vaccinateAnimal(Disease disease) {

        //vaccinateAnimal(Disease) Deze method zal een dier vaccineren voor een bepaalde ziekte. Zet er de boolean
//dus voor op true.

//vaccinateAnimal(Disease) Этот метод вакцинирует животное от определенной болезни. Поместите туда логическое значение
//так что впереди правда.

    }
}
