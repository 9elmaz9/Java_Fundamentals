package be.intecbrussel.Opdracht3;
import java.util.Random;
import java.util.Scanner; // create a package that contains the collection structure = создаем пакет который содержит структуру коллекции

public class Opdracht4DoWhileIfElse{

    public static void main(String[] args) {  // entry point to the program.точка  входа в программу

        //data initialization . инициализация данных
        ///enter all the numbers and data that are available in this task.вводим все цифры и данные которые имеется в этой задаче
        //ДАНО:
        int credits = 17;  //  number of credits the user has
        int euroBalance = 22; //  balance in euros
        int diceSides = 20; // number of cube faces
        int winNumber = 13; // winning number
        int extraCreditsForSeven = 2; // extra credits when you roll a 7
        int creditPriceInEuro = 5; // cost 20 credits in euros


        Scanner scanner = new Scanner(System.in); //create an object
        Random random = new Random(); // create for the dice to fall out

        do {   //main game loop. that is, what will happen in it.

            System.out.println("Er wordt een campagne met lootboxes georganiseerd.");// A campaign with loot boxes is being organized
            System.out.println("Je kunt de Kroon van Vriendschap winnen en je hebt slechts 3 credits nodig om hem uit te proberen.");
            System.out.println("Je hebt momenteel" + credits + "credits over! ");  //You currently havecredits


            //purchasing additional credits for euros if you fail to win
            if (credits < 3 && euroBalance >= creditPriceInEuro) {
                System.out.println("Je hebt niet genoeg credits. Je wilt 20 credits kopen voor " + credits + " euro. ( Ja/ Nee) ");
                String buyCredits = scanner.next();

                if (buyCredits.equalsIgnoreCase("Ja")) { // creating a response to the yes button
                    euroBalance -= creditPriceInEuro; // the balance of euro 22 is reduced by 5,
                    // 5 is worth a credit if you buy it with money
                    credits += 20;  //adding 20 credits, purchase
                    System.out.println("Je hebt 20 credits gekocht! Nu heb je dat" + credits + " credits.");
                }
            }

            // Now let's create variations for the dice roll .  теперь создаем для броска кубика
            int diceResult = random.nextInt(diceSides) + 1;  //created using the random method
            System.out.println("Je gooit met de dobbelstenen en het getal verschijn:" + diceResult); // You roll the dice and the number = appears

            //checking the conditions for winning and receiving additional credits.проверкуа условий выиграша и получения дполнительных кредитов
            if (diceResult == winNumber) { //this is if the number is 13. then the game is over.victory
                System.out.println("Gefeliciteerd! Je hebt de Kroon van Vriendschap gewonnen.");
                break; //the game ends because the number 13 is rolled, the winner's number

            } else if (diceResult == 7) {   // creating and checking for a condition if a 7 is rolled
                credits += extraCreditsForSeven;   // 2 points added to credits
                System.out.println("Je gooit een 7! Je krijgt " + extraCreditsForSeven + "extra credits.");
            }

            //loan balance update.обновление баланса кредитов
            credits -= 3; // minus 3 for each sample
            System.out.println("Nu heb je" + credits + "credits.");

            //запрос на продолжение игры
            System.out.println("Wil je doorgaan met het spel?(Ja/Nee)");
        } while (scanner.next().equalsIgnoreCase("Ja"));

        System.out.println("Einde van het spel. Bedankt voor je deelname!");
        scanner.close();

    }
}

