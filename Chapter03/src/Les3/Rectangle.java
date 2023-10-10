package Les3;

public class Rectangle {

    private int height;
    private int width;
    private int xPos;
    private int yPos;

    public Rectangle(){ // 1
    }
    //2
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    //3
    public Rectangle(int height, int width, int xPos, int yPos) {
        this.height = height;
        this.width = width;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    //4
    public Rectangle(Rectangle rectangle) {
        //this(this.height,this.width,this.xPos,thisyPos );// copy constructor
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.xPos = rectangle.xPos;
        this.yPos = rectangle.yPos;
    }

    public void setHeight(int height){
        this.height=height<0? -height : height;}

    public  void setWidth(int width){
        this.width=width<0?-width:width;}


    //getx():int
    public int getxPos() {
        return xPos;
    }
   //setx():int
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }
    //gety():int
    public int getyPos() {
        return yPos;
    }
    //sety():int
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
    //getWidth():int
    public int getWidth() {
        return width;
    }
    //setWidth(width:int)

    //getHeight():int
    public int getHeight() {
        return height;
    }
    //setHeight(width:int)


}