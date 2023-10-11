package Les2.Oefening3vanArrays;
//Oefening 1

//Schrijf een programma en maak van de string waarde hierbeneden een char array met index.

//String myString = "Char Array!";

//Uitkomst moet zijn: |0 = C | 1 = h | 2 = a | 3 = r | 4 = | 5 = A | 6 = r | 7 = r | 8 = a | 9 = y | 10 = ! |

public class Oefening1 {
    public static void main(String[] args) {
//1 declaralie
        String myString = "Char Array!";
//create array
        char[] charArray = myString.toCharArray();

        for (int i = 0; i<charArray.length;i++) { // charArray.length - amount , i ++= i + tot 10
            System.out.print("|"+i+"=" +charArray[i]+"|"); // ptint - een strip
        }
    }
}
