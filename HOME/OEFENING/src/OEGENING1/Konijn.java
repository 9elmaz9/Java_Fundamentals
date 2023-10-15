package OEGENING1;

public class Konijn extends Animal {
    private String color;

    public Konijn(String color) {
        super("Konijn");
        this.color = color;
    }

    public void say() {
        System.out.println(" Pi Pi");
    }


}

