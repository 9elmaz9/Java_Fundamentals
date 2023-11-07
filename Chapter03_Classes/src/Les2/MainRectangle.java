package Les2;

public class MainRectangle {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea(20, 10)); //int
        //   System.out.println(rectangle.getArea(20.50,10.50)); //double
        //   System.out.println(rectangle.getArea(20L,10L)); //long
        //   rectangle.getMessageCreation(20.0);alleen length

        rectangle.getMessageCreation(20.0, 10.0); // length + width
    }
}

