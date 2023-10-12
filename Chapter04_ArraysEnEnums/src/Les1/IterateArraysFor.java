package Les1;

public class IterateArraysFor {
    public static void main(String[] args) {

        //Hier hebben we een int array gevuld met gegevens

        int[] myArr = new int[5];
        myArr[0]=100;
        myArr[1]=200;
        myArr[2]=300;
        myArr[3]=400;
        myArr[4]=500;

        for ( int i =0 ; i < myArr.length;i ++){
            System.out.println(myArr[i]);
        }

        for(int elements:myArr){
            System.out.println("my elements :"+ elements);
        }

        //Hier word enkel index 3 uitprinten van de array
        System.out.println(myArr[3]);
    }
}
