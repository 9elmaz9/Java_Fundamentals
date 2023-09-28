package be.intecbrussel.Les5.Les3;

//Importeren van de Random class
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {


        // creëren van een nieuw object
        Random random= new Random();



        // Het genereert een boolean value
        boolean randomBoolean=random.nextBoolean();
        System.out.println(randomBoolean);


        // Het genereert een double value
        double randomDouble=random.nextDouble();
        System.out.println(randomDouble);


        //Het genereert een float value
        float randomFloat= random.nextFloat();
        System.out.println(randomFloat);


        //Het genereert een int value
        int randomInt= random.nextInt();
        System.out.println(randomInt);


        // Het genereert een int value tussen een specifieke waarden.
        int randomIntBound=random.nextInt(50);
        System.out.println(randomIntBound);









    }
}

