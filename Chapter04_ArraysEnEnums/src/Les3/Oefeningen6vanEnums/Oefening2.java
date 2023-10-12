package Les3.Oefeningen6vanEnums;

public class Oefening2 {

    public static void printEnumDay(Weekday day) {
        System.out.println("day" + day.getName());
        System.out.println("type" + day.getType());
    }

    public static void printCustomDay(String day) {
        switch ((day.toLowerCase())) {
            case"monday":
                System.out.println();

            case "tuesday":
                System.out.println();
            case "wednesday":
                System.out.println();
            case "thursday":
                System.out.println();

            case "friday":
                System.out.println();
            case "saturday":
                System.out.println();
            case "sunday":
                System.out.println();
            default:
                System.out.println();


        }
    }

}
