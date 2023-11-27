/*package Game2;
import java.util.Scanner;
public class MainApp {


        public static void main(String[] args)
        {

            char ans = 'y';
            while(ans == 'y' ||ans == 'Y'  ) {


                Scanner myScanner = new Scanner(System.in);
                System.out.println("1.Snake");
                System.out.println("2. Minefield");
                System.out.println("3. Text Based Adventure");
                System.out.println("4. TicTacToe");
                System.out.println("Enter your choice from 1 to 4");
                int choice = myScanner.nextInt();
                switch (choice) {
                    case 1: {

                    }
                    case 2: {

                    }
                    case 3: {
                        AdventureGame adventureGame=new AdventureGame(); // Create a game instance// Создаем экземпляр игры
                        adventureGame.startAdventure(); //start // Запускаем приключение

                    }
                    case 4: {
                        String[] ticTacBoard = new String[9];
                        TicTac tictac = new TicTac(ticTacBoard);     // passeren String array van size 9 aan de constructor
                        tictac.gamePlay();                           // aanroepen TicTac game play
                        break;

                    }


                }
                System.out.println("Do you want to play again y/n");
                ans = myScanner.next().charAt(0);
            }
        }


    }

}
*/