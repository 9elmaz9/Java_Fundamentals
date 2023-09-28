package be.intecbrussel.Les3.Oefening4;
import java.util.Random;
public class Oefening1 {
    /*Oefening 1
    Maak een applicatie die 5 verschillendewillekeurige integers opvraagt en
    deze afdrukt op het scherm*/
    public static void main(String[] args) {
//step 1 ,create object
        Random random=new Random();
// vraag
        System.out.println("Voer 5 cijfers in");
//task
        for(int i=0;i<5;i++) {
            int randomNum = random.nextInt();
//randomNum =int i , i = random
            System.out.println(randomNum);


        }
    }


}
