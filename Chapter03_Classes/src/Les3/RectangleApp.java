package Les3;

public class RectangleApp {


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);

        System.out.println("Rectangle:");
        System.out.println("Width:" + rectangle.getWidth());
        System.out.println("Height:" + rectangle.getHeight());


        System.out.println("Rectangle2");
        Rectangle rectangle2 = new Rectangle(1, 2, 3, 4);
        System.out.println("Height:" + rectangle2.getHeight());
        System.out.println("Width:" + rectangle2.getWidth());
        System.out.println("xPos:" + rectangle2.getxPos());
        System.out.println("yPos:" + rectangle2.getyPos());


        System.out.println("Rectangle3:");
        Rectangle rectangle3 = new Rectangle(rectangle);
        System.out.println("Height:" + rectangle3.getHeight());
        System.out.println("Width:" + rectangle3.getWidth());
        System.out.println("xPos:" + rectangle3.getxPos());
        System.out.println("yPos:" + rectangle3.getyPos());
    }
}

