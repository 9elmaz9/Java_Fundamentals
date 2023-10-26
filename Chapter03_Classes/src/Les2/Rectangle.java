package Les2;

public class Rectangle {

        public int getArea(int lenght, int widtht) {

            return lenght * widtht;
        }

        public double getArea(double length, double width) {
            return length * width;
        }

        public long getArea(long length, long width) {
            return length * width;
        }

        public void getMessageCreation(double length) {
            System.out.println("Rectangle is created!" + length);
        }

        public void getMessageCreation(double length, double width) {
            System.out.println("Rectangle is created!" + length + width);
        }
    }



/*new

   // public  class  Rectangle{
    // properties van de class
        private double length;
        private double width;
        //constructor
        public Rectangle(){

        }

        //android.os.Bundle args=new Bundle();

        Rectangle fragment=new Rectangle();
       // fragment.setArguments(args);
       // return fragment;
        }
*/

