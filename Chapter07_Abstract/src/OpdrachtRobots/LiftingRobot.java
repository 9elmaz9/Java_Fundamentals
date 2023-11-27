package OpdrachtRobots;

public class LiftingRobot extends Robot {

    private double maxLiftHeight;

    // constructor

    public LiftingRobot(double maxLiftHeight, String unitName) {
        super(unitName); // roep de constructor van de superclass an om initNAme in te stelen
        this.maxLiftHeight = maxLiftHeight;
    }

    //() om op te tillen  :// Метод подъема
    public void lift(double height) {
        if (height > maxLiftHeight) {
            System.out.println(" Opheffen niet mogelijk voor " + height + " Maximale hoogte overschreden");
        } else {
            System.out.println("Opheffen met succes voltooid " + height + " met een hoogte van " + height + " meter");
        }
    }
}
