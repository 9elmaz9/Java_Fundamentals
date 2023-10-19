package Oefeninf3;
//sub
public class Circle extends Vormen {

    private double radius;//EIGENSCHAP

    //Consrtuctor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
        // mrthod for a circle
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
        //  the calculatePerimeter for a circle
    double calulatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
