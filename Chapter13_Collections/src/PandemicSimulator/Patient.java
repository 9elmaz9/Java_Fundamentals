package Project3.PandemicSimulator;

import java.util.*;

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


    public boolean isUnknownVirus() {
        return  false;
    }

    // Method to categorize patients in a Map
    // receives a queue of patients and categorizes them according to the criteria provided.
    public static Map<Integer, List<Patient>> categorizePatients(Queue<Patient> patientsQueue) {
        Map<Integer, List<Patient>> categorizeMap = new HashMap<>();

        while (!patientsQueue.isEmpty()) {
            Patient patient = patientsQueue.poll();
            int category;

            //Категоризация пациента на основе данных: Data-driven patient categorization


            //cat1- hoge korts >=40 of oud>=65 met gewone koorts >=38 + voorwaarde - het onbekende virus hebben
            if ((patient.getAge() <= 65 && patient.getTemperature() >= 38) || patient.getTemperature() >= 40) {
                category = 1;

                //cat2-gewoone koorts  >=38  loopt het onbekende virus
            } else if (patient.getTemperature() >= 38 && patient.isUnknownVirus()) {
                category = 2;


                //onbekende virus+geen kort
            } else if (patient.isUnknownVirus() && patient.getTemperature() < 38) {
                category = 3;


                //koorts >=38 + bekend virus - andere -overige naar huis/apotheken
            } else if (patient.getTemperature() >= 38 && !patient.isUnknownVirus()) {
                category = 4;

            } else {
                continue;
            }

            //add patienten in category in MAp/ correct category
            categorizeMap.computeIfAbsent(category, k -> new ArrayList<>()).add(patient);
        }

        //Return the categorized Folder
        return categorizeMap;

    }
}

