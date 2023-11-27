package be.intecbrussel.Opdracht3;

import java.util.Random;

public class Oefening3SwitchCaseFor {

    public static void main(String[] args) {

        //create a greeting
        System.out.println("Hallo in Monsters spel  ");
//creating ban object for random selection
        Random random = new Random();
        //System.out.println("Random Integers: "+random);

        int experiencePunten = 0;
        int monstersOntmoet = 0;

//for loop to encounter monsters = цикл для встречи
        for (int i=1;i<=10;i++) {

            // creating conditions for random experience points from 1 to 3
            int puntenVanHetMonster = random.nextInt(3)+1 ;


            // Switch statement to handle
            switch (puntenVanHetMonster) {
                case 1:
                    System.out.println("Een monster tegenkomen en 1 ervaringspunten krijgen");
                    continue;
                case 2:
                    System.out.println("Een monster tegenkomen en 2 ervaringspunten krijgen");
                    experiencePunten += 2;
                    break;
                case 3:
                    System.out.println("Een monster tegenkomen en 3 ervaringspunten krijgen");
                    experiencePunten += 3;
                    break;
            }

            //create and check for 'Level up' condition
            if (experiencePunten >= 15) {
                System.out.println("Niveau omhoog! Bereikte " + experiencePunten + "experience punten");
                break; //  if level up is reached - exit the loop
            }

            // inc +  the number of monsters encountered
            monstersOntmoet++;
        }

        System.out.println("\"Aantal ontmoete monsters:" + monstersOntmoet + " monsters.");
        System.out.println("Einde van de monsterontmoeting!"); // finish
    }
}
