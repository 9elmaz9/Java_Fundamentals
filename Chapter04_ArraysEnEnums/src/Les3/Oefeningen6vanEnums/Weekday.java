package Les3.Oefeningen6vanEnums;

public enum Weekday {
    //Oefening 1
    //Schrijf een enum class van de dagen van de week en print deze uit met de index erbij.
    //Constanten
    MONDAY("Mond","Mond"),
    TUESDAY("Tues","Tues"),
    WEDNESDAY("Wed","Wed"),
    THURSDAY("Thur","Thur"),
    FRIDAY("Fri","Fri"),
    SATURDAY("Sat","Sat"),
    SUNDAY("Sun","Sun");

    private  final String name;
    private final String type;

    Weekday(String name,String type){
        this.name=name;
        this.type=type;
    }
    public String getName(){
        return  name;
    }
    public String getType(){
        return type;
    }
}





