public class Cat {  // черновик кошки

    String name; // blueprint for creating cat
    int age;

    public void meow(){  //  cant use this method in Example class Cat.meow();  it won't work / only throw object
        System.out.println("Meow");
    }
    public static void dingDong() { //  keyword STATIC can be  called without usuing  in individual Cat object
        System.out.println("Ding dong ");

    }
}
