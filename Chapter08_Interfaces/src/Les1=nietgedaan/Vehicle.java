package Les1;

public interface Vehicle {
    // constant variables -> bad practice
    //public static final int doors = 3 ; // public static final is unnecessary!
    //int wheels=4 ;

    //methods
    public abstract void speedUp(); // public abstract is unneccessary!
    void braking();
    void shiftGearUp();
    void shiftGeatDown();
    int getCurrentGear();
}



