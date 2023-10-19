package Example2;

public class MainApp {
    public static void main(String[]args){
        Multiplier multiNumners=new Multiplier();

        int result01= multiNumners.multiplyNumbers(2,5);
        int result02= multiNumners.multiplyNumbers(2,5,10);

        System.out.println(result01);
        System.out.println(result02);

    }
}
