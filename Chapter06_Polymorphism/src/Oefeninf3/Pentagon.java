package Oefeninf3;

//SUB class
public class Pentagon extends Vormen {
    //EIGENSCHAP
    private double side;//EIGENSCHAP
    //private double side2;
    //private double side3;
    //private double side4;
    //private double side5;


    //CONSTRUCTOR
    public Pentagon(double side) {
        this.side = side;
        //this.side2=side2;
        //this.side3=side3;
        //this.side4=side4;
        //this.side5=side5;
    }
// METHODS


    @Override
    double calculateArea() { // Herons's formula for the area
        //double s =(side1+side2+side3+side4+side5)/2;
        return (1.0 / 4.0) * Math.sqrt((5 * (5 + 2 * Math.sqrt(5))) * side * side);
    }

    @Override
        // method for a pentagon
    double calulatePerimeter() {
        return 5 * side;
    }
}

//    double calculatePerimeter() {
//        return 5 * side;
//    }
