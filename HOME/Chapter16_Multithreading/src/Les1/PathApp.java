package Les1;

public class PathApp {
    public static void main(String[] args) {

        MijnThread thread01 = new MijnThread("*");
        MijnThread thread02 = new MijnThread("-");

        //status NEW
        System.out.println(thread01.getState());
        thread01.start();
        thread02.start();
        // status RUNNABLE
        System.out.println(thread01.getState());

    }
}
