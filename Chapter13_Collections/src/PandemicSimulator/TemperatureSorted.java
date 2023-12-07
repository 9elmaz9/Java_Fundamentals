package PandemicSimulator;

import java.util.Comparator;

public class TemperatureSorted implements Comparator<Patient> {

    // comparator voor het sorteren op temperatuur
    @Override
    public int compare(Patient o1, Patient o2) {
        return Integer.compare(o1.getTemperature(),o2.getTemperature());
    }
}
