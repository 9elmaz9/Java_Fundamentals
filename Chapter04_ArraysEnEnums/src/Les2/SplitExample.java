package Les2;

public class SplitExample {
    public static void main(String[] args) {


        String myStr = " Java is the best!";
        //Hier splitten we de string op een spatie
        String[] strArray = myStr.split("");

        //oorspronkelijke string uitprinten
        System.out.println("String:" + myStr);

        //Loop door de string
        for (int index=0; index<strArray.length; index++){

            //Printen van de index met de waarde
            System.out.println("Index:"+index+"value og element :"+strArray[index]);
        }
    }
}
