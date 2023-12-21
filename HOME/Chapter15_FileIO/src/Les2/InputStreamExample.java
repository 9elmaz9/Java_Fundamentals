package Les2;

import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
        String sourseFile = "C:\\Users\\ELMAZ\\Desktop\\oneDrive\\Документы\\text1.txt";

        String destinationFile = "C:\\Users\\ELMAZ\\Desktop\\oneDrive\\Документы\\newtest.txt";

        try (InputStream inputStream = new FileInputStream(sourseFile);
             OutputStream outputStream = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int byteRead;

            while ((byteRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, byteRead);
            }

            System.out.println("File copied successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

