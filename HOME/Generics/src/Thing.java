public class Thing {
    public static void main(String[] args) {

        // generics =     enable types( classes and interfaces) to be parameters when defining:
        //                classes, interfaces and methods
        //                a benefit is to eliminate the need to create multiple version of methods or classes for various data types.
        //                Use 1 version for all reference data types

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArrray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArrray);
        displayArray(stringArray);

    }

    // generic method
    public static <Thing> void displayArray(Thing[] array) {
        for (Thing x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // public  void displayArray ( Integer[] array) {  такой метод по идее нужно создавать для каждого отдельного типа Int,Double e.c.t    // но выше представлен один универслаьный под все типы данных  вернее обьекты
    //    for(Integer x : array){
    //        System.out.println(x+" ");
    //   }
    //   System.out.println();
    //}


}
