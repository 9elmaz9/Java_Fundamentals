package Les3;
//constructor and metgods

public enum Color {
//Constanten
    RED(100),  // if é ptivate int color , RED(100,100),  BLUE(200,200),
    YELLOW(200),
    BLUE(300);

    //field
    private int colorCode;
//private int colorCode2;
    //Constructor
    private Color(int colorCode) {  //(,int colorCode2)

        this.colorCode=colorCode;
    }

    //methodes
    int getColorCode() {
        return colorCode;
    }
     public void colorInfo(){
         System.out.println("Universal Color");
    }
}

