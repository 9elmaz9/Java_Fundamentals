public class Arrays2D {
    public static void main(String[] args) {

        //2d arrays = an array of arrays
        String[][] cars = new String[3][3]; // {
                                            // {"Camaro","Corvette","Silverado"},   // it is another declaration method
                                            // {"Mustang","Ranger","F-150"},
                                            // {"Ferrari","Lambo","Tasla"}
                                             // };

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silvarado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Rangere";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";
//int =0
        for(int i = 0 ; i <cars.length ; i++){
            //i++
            System.out.println();
            for(int j = 0; j< cars[i].length ; j++){
                System.out.println(cars[i][j]+" ");
            }
        }


    }
}
