package Les1;

public class Duo2<E> {
    public static void main(String[] args) {

        Duo<String> duo = new Duo<>("Hello", "world");
        System.out.println(duo.getS1() + duo.getS2());


        Duo<Integer> duo1 = new Duo<>(5, 10);
        System.out.println(duo1.getS1() + duo1.getS2());


    }
}
