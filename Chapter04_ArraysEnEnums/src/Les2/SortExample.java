package Les2;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int[] myArr={10,-20,33,9,97,-65,345};
        System.out.print("The original myArr is:");

         for(int num:myArr){
             System.out.print(num+" "); //The original myArr is:10 -20 33 9 97 -65 345
         }



         Arrays.sort(myArr,0,4);

        System.out.print("\nThe sorted myArr with a range from 0 to 4:");
        for(int num:myArr){
            System.out.print(num+" " );//The sorted myArr with a range from 0 to 4:-20 9 10 33 97 -65 345
        }

        Arrays.sort(myArr);

        System.out.print("\nThe whole myArr is:");
        for(int num : myArr){
            System.out.print(num+ " "); //The whole myArr is:-65 -20 9 10 33 97 345
        }
    }
}
