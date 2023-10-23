package FinalExample;

public class FinalExample2 {
    public static void main(String[] args) {
        final StringBuilder stringBuilder = new StringBuilder("Intec");   //stringBuilder=sb

        //Printing the element
        System.out.println("Before the change:" + stringBuilder);

        //Changing internal state of object reference by final reference variable sb
        ////Изменение внутреннего состояния ссылки на объект с помощью окончательного построителя строки ссылочной переменной
        stringBuilder.append("Brussel");

        //Again printing the element after appending above element in it
        ////Снова печатаем элемент после добавления в него вышеуказанного элемента
        System.out.println("After the change:" + stringBuilder);


        //final in een loop
        int[] arr = {1, 2, 3};

        //final with for-each statement
        for (final int numbers : arr) {


            System.out.println(numbers);
        }

    }

}
