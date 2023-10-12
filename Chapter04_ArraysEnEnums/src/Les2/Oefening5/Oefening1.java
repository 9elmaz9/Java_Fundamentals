package Les2.Oefening5;

public class Oefening1 {

        public static void main(String[] args) {

            //Oefening 1

            //Maak een 3D array van 5 5 5 elementen en print de waarde van deze elementen uit.

            // create 3D-array van 5x5x5
            int[][][] threeDArray = new int[5][5][5]; // 3 array -5

            // fill the array with some values
            for (int i = 0; i < 5; i++) {
                for (int a = 0; a < 5; a++) {
                    for (int b = 0; b < 5; b++) {
                        threeDArray[i][a][b] = i + a + b;
                    }
                }
            }

            //   the value of these elements
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        System.out.println("De waarde van deze elementen [" + i + "][" + j + "][" + k + "] = " + threeDArray[i][j][k]);
                    }
                }
            }
        }
    }



