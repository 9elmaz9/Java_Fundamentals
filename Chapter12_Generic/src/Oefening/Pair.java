package Oefening;

public class Pair <T,M> {

    T x ;
    M y;

    //constructor die twee waarden accepteert
    public Pair(T x ,M y){
        this.x=x;
        this.y=y;

    }

    public T getX() {
        return x;
    }

    public M getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
