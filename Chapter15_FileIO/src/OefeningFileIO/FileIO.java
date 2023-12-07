package OefeningFileIO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {
    public static void main(String[] args) {

        fromElmazToHilal();

        AnimalsFile();

    }

    private static void AnimalsFile() {
        //instances
        Horse horse = new Horse("Star", false);

        //path
        Path animalPath = Path.of("C:/Users/ELMAZ/IdeaProjects/INTECBRUSSEL/Chapter15_FileO/src/OefeningFileIO/AnimalsFile.txt");

        //check
        try {
            Files.createDirectories(animalPath.getParent()); // exist

            //schrijf info over animal
            FileWriter animalWriter = new FileWriter(animalPath.toString());
            animalWriter.write(horse.toString() + "The horse is my favourite animal.");
            animalWriter.write(horse.toString() + "They are intelligent,friendly,understanding ,trustworthy and beautiful");
            animalWriter.write(horse.toString() + "Horses are magnificient animals domesticated by humankind for thousands of years.");
            animalWriter.close();

            //read info
            BufferedReader animalReader = new BufferedReader(new FileReader(animalPath.toString()));
            String line;
            while ((line = animalReader.readLine()) != null)
                System.out.println(line);
            //System.out.println( reader.readLine());
            animalReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void fromElmazToHilal() {
        FileWriter fileWriter = null;
        try {
            Path path = Path.of("C:/Users/ELMAZ/IdeaProjects/INTECBRUSSEL/Chapter15_FileO/src/OefeningFileIO/fromElmazToHilal.txt"); // path

            Files.createDirectories(path.getParent()); // check exist of no
            fileWriter = new FileWriter(path.toString()); // nieuwe obj

            fileWriter.write("\"All our dreams can come true, if we have the courage to pursue them.\" — Walt Disney");
            fileWriter.write("\"The future belongs to those who believe in the beauty of their dreams.\" — Eleanor Roosevelt");
            fileWriter.write("\"Dreams come true. Without that possibility, nature would not incite us to have them.\" — John Updike");
            fileWriter.write("\"Dream as if you'll live forever. Live as if you'll die today.\" — James Dean");
            fileWriter.write("\"Some men see things as they are and say why. I dream things that never were and say why not.\" — George Bernard Shaw");


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();

                }
            }
        }
    }
}

class Horse {
    private String name;
    private boolean carrot;

    public Horse(String name, boolean food) {
        this.name = name;
        this.carrot = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFood() {
        return carrot;
    }

    public void setFood(boolean food) {
        this.carrot = food;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", food=" + carrot +
                '}';
    }
}




