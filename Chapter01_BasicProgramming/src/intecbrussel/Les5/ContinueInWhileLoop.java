package intecbrussel.Les5;

public class ContinueInWhileLoop {
    public static void main(String[] args) {

        int index=0;
        while(index<10){
            if(index==4) {
                index++;
                continue;
            }
            System.out.print(index); // 012356789
            index++;
            }
        }
    }

