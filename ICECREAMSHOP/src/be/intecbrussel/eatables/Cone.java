package be.intecbrussel.eatables;

public class Cone implements Eatable {
      public enum Flavor{

          STRAWBERRY,
          BANANA,
          CHOCOLATE,
          VANILLA,
          LEMON,
          STRACIATELLA,
          MOKKA,
          PISTACHE;

      }


    //Properties
    public Flavor[] balls;

    //Constructor
    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    //eatable method
    @Override
    public void eat() {
        System.out.println("EAT me");

    }
}

