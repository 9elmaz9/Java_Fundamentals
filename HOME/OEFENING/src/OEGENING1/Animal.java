package OEGENING1;

import java.util.Arrays;

public class Animal {

     protected String species;

     public Animal(String species){
         this.species=species;
     }
     public  void makeSounds(){
         System.out.println("Do it ");
     }

         public static void main(String[] args) {
             Hond dog = new Hond("Labrador");
             dog.bark();
             dog.bark();

             Konijn cat = new Konijn("White");
             cat.say();
             cat.say();

             Wasbeer bird = new Wasbeer("Sparrow");
             bird.sing();
             bird.sing();

             System.out.println("Continents: " + Arrays.toString(Continent.values()));
         }
     }


