public class Prize {
    private String name;
    private String description;


    Prize(String name, String description) {
        this.name = name;
        this.description = description;
    }


     String getName() {
        return name;
    }

     String getDescription() {
        return description;
    }
}