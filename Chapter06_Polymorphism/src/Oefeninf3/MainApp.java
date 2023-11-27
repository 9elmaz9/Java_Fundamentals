package Oefeninf3;

public class MainApp {
    public static void main(String[] args) {
        // create instance  of each shape
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(7, 7);
        Pentagon pentagon = new Pentagon(7); // for equilateral pentagon
        //Driehoek driehoek=new Driehoek(5,7,8);

        //Calculate and display area and perimeter for each shape
        displayVormen(circle);
        displayVormen(rectangle);
        displayVormen(pentagon);

    }

    // common methodes do display area and perimetr for any shape
    private static void displayVormen(Vormen vormen) {
        System.out.println("Vormen:" + vormen.getClass().getSimpleName()); //  used to get the name of the class (triangle,...)
        // to display information about the shape.
        //используется для получения имени класса (треугольника, круга и т. д.)
        // для вывода информации о фигуре.circle в papke shapes = getClass().getSimpleName() вернет "Circle",а не "shapes.Circle".
        System.out.println("Area:" + vormen.calculateArea());
        System.out.println("Petimeter:" + vormen.calulatePerimeter());
    }
}
