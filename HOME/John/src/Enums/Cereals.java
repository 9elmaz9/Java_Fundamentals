package Enums;

public enum Cereals {
    CAPATAIN_CRUNCH(50,50.2),
    FROOT_LOOPS(60,56),
    REESES_PUFFS(100,56),
    COCOA_PUFFS(75,46);

    int levelOfDeliciosness;
    //final  int levelOfDeliciosness; // final - can't be change

    final double price;

    //Cereals(int levelOfDeliciosness){  // create constructor for value of it
    // this.levelOfDeliciosness=levelOfDeliciosness;  // for 1 parametrs  :  CAPATAIN_CRUNCH(50),
    // }
    Cereals(int levelOfDeliciosness, double price) {  // create constructor for value of it
        this.levelOfDeliciosness = levelOfDeliciosness; // For é parametrs :  CAPATAIN_CRUNCH(50, 78),
        this.price=price; //  fo works final double prise ; -write this line
    }
}
