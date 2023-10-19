package Example5;
//SUB KLAS
public class DifferentTestClass extends TestInstanceof {


    //DOWNCASTING WITH INSTANCEOF
    public static void method01(TestInstanceof test) {
        if(test instanceof DifferentTestClass){
            DifferentTestClass dtc=(DifferentTestClass) test;
            System.out.println("Downcasting works!");
        }
    }
}
