package Example5;
// oblect onstanceof Class

public class Instance {

    public static void main(String[] args) {

        //chtking if name is  a instanceof String class

        String name = "Intec Brussel"; // instance = vergelijkingoperator - boolean : true of false retourneert

        System.out.println("Is name a instance of String:"+(name instanceof String)); // true

        //important :Pbject is ancestor of all classes in Java

        System.out.println("Is name a instance of Object class:"+(name instanceof Object)); // trye
    }
}
