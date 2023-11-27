package OpdrachtRobots;

class BendingRobot extends Robot {

    private double maxBendAngle; // eigenschap did robot

    // constructor  met String  en double maxBendAngle
    public BendingRobot(double maxBendAngle, String unitName) {
        super(unitName); // roep de constructor van de superclass an om initNAme in te stelen
        this.maxBendAngle = maxBendAngle;
    }
    // 3 - creeeren method om te buigen
    public void bend(double angle){
        if (angle > maxBendAngle){
            System.out.println("Buigen niet mogelijk voor . Max hoek overschreden");
        }else{
            System.out.println("Buigen met succes voltooid " + angle+"met een hoek van" + angle+"graden");
        }
    }
}
