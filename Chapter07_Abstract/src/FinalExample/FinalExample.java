package FinalExample;

public class FinalExample {

    //final varianelen, direct initialize
    final int THRESHOLD=5;

    //a final static variable Pi , deirect initialize
    static final double PI=3.141592653589793;

    //blank final variable
    final int CAPACITY;

    //blank final variable
    static final int DAYS_OF_THE_WEEK;

    //blank final variable
    final int MINIMUM;

    //instance initializer block
    {
        CAPACITY = 25;
    }

    //static initializer block
    static {
        DAYS_OF_THE_WEEK = 7;
    }
    /* constructor for initializing MINIMUM Note that if ther are lore than one constructor,
    *you must initialize MINIMUN in them also
     */
    public FinalExample(){
        MINIMUM=-1;
    }
}
