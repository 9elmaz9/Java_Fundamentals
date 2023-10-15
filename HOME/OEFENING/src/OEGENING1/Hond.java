package OEGENING1;

public class Hond extends Animal {
    private String breed;

    public Hond(String breed) {
        super("Hond");
        this.breed = breed;
    }

    public void bark() {
        System.out.println("ПЙА");
    }

}
