package Oefeninf3;

//sub class
public class Rectangle extends Vormen {
    //EIGENSCHAP
    private double length;
    private double wigth;

    //constructor
    public Rectangle(double length, double wigth) {
        this.length = length;
        this.wigth = wigth;
    }

    @Override // method for a rectangle
    double calculateArea() {
        return length * wigth;
    }

    @Override
        // method calculate perimeter
    double calulatePerimeter() {
        return 2 * (length + wigth);
    }
}


