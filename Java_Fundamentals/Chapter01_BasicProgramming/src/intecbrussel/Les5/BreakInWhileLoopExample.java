package intecbrussel.Les5;

public class BreakInWhileLoopExample {

    public static void main(String[] args) {

        int index=0;

        while(index<10){

            System.out.println(index);
            index++;

            if(index==4){
                break;
            }
        }
    }
}
