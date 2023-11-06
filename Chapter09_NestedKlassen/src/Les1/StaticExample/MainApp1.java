package Les1.StaticExample;

public class MainApp1 {

    public static void main(String[] args) {
        OuterClass1.InnerClass innerClass = new OuterClass1.InnerClass(); // instance
        System.out.println("Static inner x = " + innerClass.getStaticInnerX());


    }
}
