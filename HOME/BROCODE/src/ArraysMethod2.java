public class ArraysMethod2 {

    public static void main(String[] args) {

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        //System.out.println(cars[0]); // 0=Camaro ; 1=Corvette ;2=Tesla
        //how we can use for a loop to iterate all of this elements
        for (int i = 0 ; i < cars.length;i++) { // i =0 + afte increment + 1 = i = 1
            System.out.print(cars[i]+" "); //Camaro Corvette Tesla
            //jusd used to store multiple values withina single variables
        }
    }
}

