package be.intecbrussel.Les4;

public class SwitchExample {

    public static void main(String[] args) {

        String str= "we";

        switch (str)
        {
            case"I":
                System.out.println("I want to become a doctor.");
            case"we":
                System.out.println("We are Indian.");
            case"you":
                System.out.println("You are my cronyfriend.");
                break;
            case"our":
                System.out.println("Our Indian flag has tri-color.");
            default:
                System.out.println("It is the default statement.");
        }

    }




}
