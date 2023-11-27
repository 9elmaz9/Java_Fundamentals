package ComparableExample;

public interface DuoApp {
    public static void main(String[] args) {

        ComparableDuo<Integer> d1 = new ComparableDuo<>(3,5);
        ComparableDuo<Double> d2 = new ComparableDuo<>(3.5, 7.5);
        //ComparableDuo<Number> d3 = new ComparableDuo<>( 3, 7.5);
        //Can't be used, because it doesn't implement Comparable interface

        System.out.println(d1.getLowest()); //5
        System.out.println(d2.getHighest()); //3.5


        ComparableDuo<String> s1 = new ComparableDuo<>("Mert","Vigit");
        System.out.println(s1.getLowest());


    }
}

