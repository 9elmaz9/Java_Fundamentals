package AvonturenAPP;

import java.util.Scanner;

//класс для представления сценария приключения
//class to represent an adventure scenario
public class AdventureScenario extends AdventureStep {

    //constructor
    public AdventureScenario(String description) {
        super(description); //зовем из супер класса- Описание текущего шага.
        //call from the super class - Description of the current step.
    }

    // реализация метода performStep для сценария приключения
    //implementation of the performStep method for an adventure scenario
    @Override
    public AdventureStep performStep() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(description);
        System.out.println("1.Continue following the footsteps on the beach.");
        System.out.println("2.Change your path.");


        int userChoise; //Variable to store the user's choice
        // Цикл для обеспечения правильного выбора пользователя (1 или 2)
        do {// Loop to ensure user selects correctly (1 or 2
            System.out.println("Select an action (1-2): ");
            userChoise = scanner.nextInt();
        } while (userChoise != 1 && userChoise != 2);
        
// Check the user's selection and take appropriate action// Проверка выбора пользователя и выполнение соответствующих действий
        
        if (userChoise == 1) {
            System.out.println("You decide to continue following the footsteps on the beach.");
            // Check if there is a next step towards cannibals // Проверка, есть ли следующий шаг в направлении к людоедам
            
            if (choiceToCannibals == null) {
                
                System.out.println("But the journey is over. The cannibals surrounded you. End of the adventure.");
                return null; // Return null to end the adventure // Возвращаем null, чтобы завершить приключение
            } else {
                return choiceToCannibals; // Return the next step towards cannibals // Возвращаем следующий шаг в направлении к людоедам
            }
        } else {

            System.out.println("You decide to change your path.");

// Проверка, есть ли следующий шаг в направлении к спасению// Checking if there is a next step towards salvation
            if (choiseToRescue == null) {
                System.out.println("However, you find no salvation. You are surrounded by cannibals and your adventure is over.");
                return null;// Return null to end the adventure // Возвращаем null, чтобы завершить приключение
            } else {
                return choiseToRescue; // Return the next step towards salvation// Возвращаем следующий шаг в направлении к спасению
            }
        }
    }
}




