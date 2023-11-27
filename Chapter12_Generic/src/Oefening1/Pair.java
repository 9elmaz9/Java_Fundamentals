package Oefening1;

public class Pair<T> {
    private  T first;
    private T second;

    //constructor die twee waarden accepteert
    public Pair(T first,T second){
        this.first=first;
        this.second=second;
    }


    //() om waarden op te halen
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first+","+ second +")";
    }
}


