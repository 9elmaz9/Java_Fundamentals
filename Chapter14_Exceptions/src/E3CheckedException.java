import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E3CheckedException {
    //meerdere exception kunnen worden gegooid met trows
    public static void main(String[] args) {

        String a = "C:\\Users\\Intec\\Desktop\\exceptions.doxc";

        try {
            FileInputStream fis = new FileInputStream(a);
            System.out.println("je heb deze bestaand");
        } catch (FileNotFoundException exception) {
            System.out.println("Deze bestand bestaat niet");
            //System.out.println("Exception :" + exception);
        }
    }
}
