package Les1.CarVehicle.Oefening1;

import java.util.Objects;

class Animal {
    // condition
    private String name;
    private  double age;

    public Animal(String name , double age){
        this.name=name;
        this.age=age;
    }
    //implementing toString
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //implementatio, equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }
// implementing hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    // method om het sound  te maken
    public void makeSound(){
        System.out.println("Animal sounds");
    }

}
