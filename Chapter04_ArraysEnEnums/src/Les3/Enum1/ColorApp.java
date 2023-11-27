package Les3.Enum1;

import Les3.Enum1.Color;

public class ColorApp {
    public static void main(String[] args) {

        Color c1 = Color.RED;
        System.out.println(c1);

        //values() en ordinal()methods
        Color[] myColorArr = Color.values();
        for (Color col : myColorArr) {
            System.out.println(col + " at index " + col.ordinal());
        }
    }
}

