package Project3.PandemicSimulator;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public  class AgeSorter implements Comparator<Patient> {

    //comparator voor het sorteren op age

    @Override
    public int compare(Patient o1, Patient o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }

    @Override
    public Comparator<Patient> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Patient> thenComparing(Comparator<? super Patient> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Patient> thenComparing(Function<? super Patient, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Patient> thenComparing(Function<? super Patient, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Patient> thenComparingInt(ToIntFunction<? super Patient> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Patient> thenComparingLong(ToLongFunction<? super Patient> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Patient> thenComparingDouble(ToDoubleFunction<? super Patient> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
