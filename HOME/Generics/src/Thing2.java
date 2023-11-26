public class Thing2 {

    public static void main(String[] args) {

        // generics =     enable types( classes and interfaces) to be parameters when defining:
        //                classes, interfaces and methods
        //                a benefit is to eliminate the need to create multiple version of methods or classes for various data types.
        //                Use 1 version for all reference data types

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArrray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArrray));
        System.out.println(getFirst(stringArray));

    }

    public static <Thing> Thing getFirst(Thing[] array) {

        return array[0]; // возвразаем нулевой индекс каждого из значений

    }
}
