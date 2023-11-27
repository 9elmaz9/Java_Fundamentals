package OpdrachtRobots;
//main
public class RobotApp {
    public static void main(String[] args) {
        //creeer instanties van mijn robots
        BendingRobot bendingRobot = new BendingRobot(90, "Bib");
        // test   de bend method
        bendingRobot.bend(45.0); // buigen gelukt
        bendingRobot.bend(120.0); // niet mogelijk


        LiftingRobot liftingRobot = new LiftingRobot(10, "Bob");

        //test de kigt methode
        liftingRobot.lift(8.0 ); // opheffen gelukt//
        liftingRobot.lift(15.0); // opheffen niet mogelijk


        CrazyRobot crazyRobot = new CrazyRobot("Crazyyyyy");
        //test de boot method van crazyrobot
        crazyRobot.boot();

// toSring for each robot
        System.out.println(bendingRobot);
        System.out.println(liftingRobot);
        System.out.println(crazyRobot);
    }
}
