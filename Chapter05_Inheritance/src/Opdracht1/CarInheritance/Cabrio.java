package Opdracht1.CarInheritance;

//кабриолет с дополнительной функцией люка
// represents a convertible car with an additional sunroof feature

import java.lang.invoke.StringConcatException;

public class Cabrio  extends  Car{
    private boolean sunroof; // dak van de  dit auto

    //rонструктор для инициализации свойств кабриолета
    // constructor om eigenschappen van de cabrio te initialiseren

    public Cabrio(String color , int hp  ,boolean sunroof){
        super(color,hp); // roep de constructor van de superklasse aan
        this.sunroof=sunroof; // allen hier
    }

    public boolean getSunroof() { // get poluchat
        return sunroof;
    }
    // methode om het dak te openen
    public  void openROff(){ // крыша открыта
        System.out.println("Roor is opened."); // da is geopend
    }

    @Override
    public String toString() {  // method представление
        //// method представление methode om de status van de dit car weer te geven
        return  "Cabrio{" +
                "color='" + getColor() + '\'' +
                ", speed=" + getSpeed() +
                ", hp=" + getHp() +
                ", sunroof=" + sunroof +
                '}';
    }
}

