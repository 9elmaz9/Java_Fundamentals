package AvonturenAPP;

import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
//позволяет пользователю делать выбор
//allows the user to make a choice

        Scanner scanner = new Scanner(System.in);// для считывания ввода пользователя с клав

        do { // испол для того что бы игра повторялась, если польз решит сыграть заново
            System.out.println("Welcome to Island Adventures!");
            System.out.println("You find yourself on a deserted island, and your goal is to leave it.");

            //создаем шаши приключения

        /*AdventureStep step1= new AdventureScenario("Ты просыпаешься на пляже без памяти.");
        AdventureStep step2= new AdventureScenario("Вдалеке слышны странные звуки.");
        AdventureStep step3= new AdventureScenario("Ты нахsодишь загадочные руины.");
        AdventureStep step4= new AdventureScenario("Ты замечаешь следы людей.");
        AdventureStep step5= new AdventureScenario("Ты видишь корабль вдалеке.");
        AdventureStep step6= new AdventureScenario("Ты услышал странный шепот в кустах.");
        AdventureStep step7= new AdventureScenario("Ты стоишь перед группой людоедов.");
        AdventureStep step8= new AdventureScenario("Ты видишь дым от костра.");
        AdventureStep step9= new AdventureScenario("Ты слышишь звук мотора и видишь флаг спасателей.");
        AdventureStep step10= new AdventureScenario("Ты достиг пляжа и видишь лодку спасателей.");

        // устанавливаем связи между шагами
        step1.choiceToCannibals=step2;
        step1.choiseToRescue=step4;


        step2.choiceToCannibals=step7;
        step2.choiseToRescue=step3;


        step3.choiceToCannibals=null;
        step3.choiseToRescue=null;

        step4.choiceToCannibals=step7;
        step4.choiseToRescue=step5;

        step5.choiceToCannibals=step6;
        step5.choiseToRescue=step9;

        step6.choiceToCannibals=null;
        step6.choiseToRescue=step9;

        step7.choiceToCannibals=null;
        step7.choiseToRescue= null;

        step8.choiceToCannibals=step7;
        step8.choiseToRescue=step10;

        step9.choiceToCannibals=step7;
        step9.choiseToRescue=step10;

        step10.choiceToCannibals=null;
        step10.choiseToRescue=null;
*/
            // // Создаем шаги приключения
            AdventureStep step1 = new AdventureScenario("You wake up on the beach, the memory of the past is lost. There is a fork in the road in front of you.");
            AdventureStep step2 = new AdventureScenario("You found traces of people on the shore.");
            AdventureStep step3 = new AdventureScenario("A ship is visible in the distance; rescue is possible.");
            AdventureStep step4 = new AdventureScenario("You hear a strange noise in the forest.");
            AdventureStep step5 = new AdventureScenario("You have discovered an underwater cave.");
            AdventureStep step6 = new AdventureScenario("Smoke from the fire rises in the air.");

// Устанавливаем связи между шагами // Establish connections between steps
            step1.choiceToCannibals = step2;
            step1.choiseToRescue = step2;

            step2.choiceToCannibals = step3;
            step2.choiseToRescue = step3;

            step3.choiceToCannibals = step4;
            step3.choiseToRescue = null;

            step4.choiceToCannibals = step6;
            step4.choiseToRescue = step5;

            step5.choiceToCannibals = step6;
            step5.choiseToRescue = step6;

            step6.choiceToCannibals = null;
            step6.choiseToRescue =  new AdventureStep("Hurray. You are saved!") {
                @Override
                public AdventureStep performStep() {
                    System.out.println(description);
                    return null;
                }
            };

            //let's start the adventure
            AdventureStep currentStep = step1;
            while (currentStep != null) {  // currentStepотслеживает текущий шаг прикл
                currentStep = currentStep.performStep(); // игра выполняется до тех пор пока не станет =null
//performStep() текущего шага. Метод возвращает следующий шаг (или null, если игра завершена). Таким образом, программа продолжает выполнять шаги приключения до тех пор, пока игра не завершится.
            }
            System.out.println("Thanks for playing! Do you want to play again? (Yes / No) :");
        } while (scanner.next().equalsIgnoreCase("yes"));
        System.out.println("Thank you for playing! See you on new adventures!");

    }
}
