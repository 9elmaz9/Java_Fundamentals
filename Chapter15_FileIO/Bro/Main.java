package Bro;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // file = an abstract representation on file and directory pathnames
        File file = new File("secret_message.txt");   // doesn't exist
        //C:/Users/ELMAZ/IdeaProjects/INTECBRUSSEL/Chapter15_FileO/src/Bro/secret_message.txt  - exist
// "C:\\Users\\ELMAZ\\IdeaProjects\\INTECBRUSSEL\\Chapter15_FileO\\src\\Bro\\secret_message.txt"

        if (file.exists()) {
            System.out.println("That file exists! :O!");
            System.out.println(file.getPath());   // "secret_message.txt" - file string
            System.out.println(file.getAbsolutePath()); // location on computer
            System.out.println(file.isFile()); // return true or false
            //file.delete();
            //file.
        } else {
            System.out.println("That file doesn't exist ;(");
        }
    }
}
