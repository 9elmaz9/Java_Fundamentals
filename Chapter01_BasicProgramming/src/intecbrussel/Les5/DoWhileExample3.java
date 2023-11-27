package intecbrussel.Les5;

public class DoWhileExample3 {
    public static void main(String[] args) {

        int x = 21, sum = 0;

        do {
            //Execution statements(Body of loop)

            //Here,the line will be printed even if the condition is false

            sum += x;
            x--;

            //x=21 , sum = 20
            //2.sum+x=x
            //sum= 41 , x = 19
            // until >10  , last sum= 176 , x=11
            //sum getalen 21  until 11 = 176
            }

            //Now checking condition
            while (x > 10) ;

            //Summing up
            System.out.println("Summation:" + sum);
        }
    } // 176


