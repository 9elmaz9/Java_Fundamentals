package John;

import Les1.BufferedWriter1;

import java.io.*;

public class FileIoExp {
    public static void main(String[] args) {

       // for write
        String[] names = {"John", "Carl", "Jerry"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ELMAZ\\IdeaProjects\\INTECBRUSSEL\\Chapter15_FileO\\src\\John\\output.txt"));
                    //"output.txt"));
            writer.write("Writing to a file.");
            writer.write("\nWriting to a file2.");

            for(String name : names){
                writer.write("\n"+ name);
            }

            writer.close(); // без этого не будет читаться

        } catch (IOException e) {
            e.printStackTrace();
        }


        //for read
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            //how use it
            String line;
            while ((line=reader.readLine()) !=null)
                System.out.println(line);
            //System.out.println( reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
