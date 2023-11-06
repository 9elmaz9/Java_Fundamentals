package Les1.NonStaticExample;

public class MainApp4NonStaticE {
    public static void main(String[] args) {

        NonStaticExample nonStaticExample = new NonStaticExample();// normale objectcreatie
        NonStaticExample.Inner inner = nonStaticExample.new Inner(); // nieuwe objectcreatie
        nonStaticExample.run(); // () van NOnStaticExample
        inner.run();

    }

}
