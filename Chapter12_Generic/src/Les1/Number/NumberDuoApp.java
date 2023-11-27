package Les1.Number;

public class NumberDuoApp {
    public static void main(String[] args) {

        NumberDuo<Integer> nd1=new NumberDuo<>(2,5);
        NumberDuo<Double> nd2=new NumberDuo<>(2.5,5.7);
        NumberDuo<Number> nd3=new NumberDuo<>(2,5);

        System.out.println(nd1.sum());
        System.out.println(nd2.sum());
        System.out.println(nd3.sum());
       // System.out.println(nd4.getFirst());



    }
}
