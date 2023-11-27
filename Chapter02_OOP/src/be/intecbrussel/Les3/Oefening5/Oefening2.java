package be.intecbrussel.Les3.Oefening5;
import java.util.Random;
public class Oefening2 {
    /*Oefening 2
Maak een applicatie die 6 willekeurige getallen afdrukt tussen de 0 en 45.
Net als een Lotto.*/

    public static void main(String[] args) {

        Random random =new Random();

        for( int i =0; i<6;i++)
        {
            int x= random.nextInt(45);
            System.out.println(x);
        }

        /*int random1IntBound= random.nextInt(45);
        int random2IntBound= random.nextInt(45);
        int random3IntBound= random.nextInt(45);
        int random4IntBound= random.nextInt(45);
        int random5IntBound= random.nextInt(45);

        System.out.println(random1IntBound);
        System.out.println(random2IntBound);
        System.out.println(random3IntBound);
        System.out.println(random4IntBound);
        System.out.println(random5IntBound);*/



    }
}


