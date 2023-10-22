package Enums;

public class EnumTutorial1 {

    public static void main(String[] args) {

        //DaysOfTheWeek day = new DaysOfTheWeek(); neen
        DaysOfTheWeek day=DaysOfTheWeek.thursday; // value thursday ,  can use this type variabl
        if(day==DaysOfTheWeek.thursday) {
            System.out.println("Yay it's almost Friday!");
        }
        for(DaysOfTheWeek myDay : DaysOfTheWeek.values()){
            System.out.println(myDay);
        }
    }
}
