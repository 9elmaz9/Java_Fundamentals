package Les3.Oefeningen6vanEnums;

public class Oefening1WeekDay {
    public static void main(String[] args) {

        //values() en ordinal()methods
        Weekday[] myOefening1 = Weekday.values();
        for (Weekday dag : myOefening1) {
            System.out.println(dag + "|  at index" + dag.ordinal());
        }
    }
}
