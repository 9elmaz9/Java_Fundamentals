package PandemicSimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Patient {
    private String nationalRegistryNumber;
    private String fullName;
    private int age;
    private int temperature;
    private boolean Virus;
    private boolean ensured;


    public Patient(String nationalRegistryNumber, String fullName, int age, int temperature, boolean virus, boolean ensured) {
        this.nationalRegistryNumber = nationalRegistryNumber;
        this.fullName = fullName;
        this.age = age;
        this.temperature = temperature;
        Virus = virus;
        this.ensured = ensured;
    }

    public String getNationalRegistryNumber() {
        return nationalRegistryNumber;
    }


    public void setNationalRegistryNumber(String nationalRegistryNumber) {
        this.nationalRegistryNumber = nationalRegistryNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isVirus() {
        return Virus;
    }

    public void setVirus(boolean virus) {
        Virus = virus;
    }

    public boolean isEnsured() {
        return ensured;
    }

    public void setEnsured(boolean ensured) {
        this.ensured = ensured;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return getAge() == patient.getAge() && getTemperature() == patient.getTemperature() && isVirus() == patient.isVirus() && isEnsured() == patient.isEnsured() && Objects.equals(getNationalRegistryNumber(), patient.getNationalRegistryNumber()) && Objects.equals(getFullName(), patient.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNationalRegistryNumber(), getFullName(), getAge(), getTemperature(), isVirus(), isEnsured());
    }

    @Override
    public String toString() {
        return "Patient{" +
                "nationalRegistryNumber='" + nationalRegistryNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", temperature=" + temperature +
                ", Virus=" + Virus +
                ", ensured=" + ensured +
                '}';
    }


}
