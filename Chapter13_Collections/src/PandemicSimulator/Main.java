package PandemicSimulator;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {

        //oefening1
        List<Patient> uniquePatients = getUniquePatients(); // roep () om unieke patientenlijst te verkrijgen
        //print de  uniq.patient aff
        for (Patient patient : uniquePatients) {
            System.out.println("Een unieke lijst " + patient);
            //Een unieke lijst van patiënten en het handhaven van de orde
        }


        System.out.println( "\n");



       //oefening2
            //вызов метода получения отсортированного списка пациентов в очереди
            //()  om de gesorteerde patiëntenlijst in een Queue te verkrijgen
            Queue<Patient> sortedPatientQueue = getSortedPatientsQueue();
            //распечатываем :
            while (!sortedPatientQueue.isEmpty()){
                System.out.println("sortedPatientQueue" +sortedPatientQueue.poll());
            }

        }







    public static List<Patient> getAllPatients() {
        List<Patient> allPatients = new ArrayList<>(); // een lijst van alle patiënten te verkrijgen

        Patient donaldDonald = new Patient("110201321", "Donald Donald", 90, 39, false, true);
        allPatients.add(new Patient("030201321", "Lucky Luke", 69, 38, true, false));
        allPatients.add(new Patient("030201322", "Stromae Papaoutai", 35, 40, false, true));
        allPatients.add(new Patient("030801321", "Gringoire Lune", 80, 36, true, true));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030244321", "Sanic the HedgeHog", 16, 37, true, true));
        allPatients.add(new Patient("110201321", "Donald Donald", 90, 39, false, true));
        allPatients.add(new Patient("110201321", "Donald Donald", 90, 39, false, true));
        allPatients.add(new Patient("088201321", "Bilbo Baggins", 23, 39, true, false));
        allPatients.add(new Patient("035501321", "Lucio Correa Dos Santos", 40, 38, false, true));
        allPatients.add(new Patient("030206621", "Doctor Who", 33, 35, true, true));
        allPatients.add(new Patient("030245321", "Luke Cage", 46, 41, true, false));
        allPatients.add(new Patient("030298321", "Naruto Uzumaki", 13, 38, false, false));
        allPatients.add(new Patient("125201321", "Billy Batson", 15, 40, true, false));
        allPatients.add(new Patient("987201321", "Joseph Joestar", 75, 36, true, false));
        allPatients.add(new Patient("645201321", "Jon Snow", 33, 35, false, false));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("582201321", "Alexander Hamilton", 65, 38, false, false));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030201231", "Zelda of Hyrule", 17, 38, false, true));
        allPatients.add(new Patient("830208651", "Mother Theresa", 98, 39, true, false));
        allPatients.add(new Patient("030209741", "Willy Wonka", 70, 40, true, true));
        allPatients.add(new Patient("030205411", "Scrooge McDuck", 73, 38, true, false));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("030209861", "Sonia Magnlia", 35, 39, false, false));
        allPatients.add(new Patient("030278921", "Peter Parker", 21, 40, true, false));
        allPatients.add(new Patient("030269821", "Bruce Wayne", 46, 35, false, true));
        allPatients.add(new Patient("030215421", "Seto Kaiba", 22, 38, false, true));
        allPatients.add(new Patient("030296321", "Mario Mario", 50, 37, false, false));
        allPatients.add(new Patient("035051321", "Harry Potter", 18, 39, true, true));
        allPatients.add(new Patient("368201321", "Prince Charming", 95, 37, true, true));
        allPatients.add(new Patient("036781321", "Mary Poppins", 38, 38, true, false));
        allPatients.add(new Patient("033691321", "Alexander the Great", 51, 37, false, true));
        allPatients.add(new Patient("687201321", "Crazy Frog", 5, 39, false, false));
        allPatients.add(new Patient("030201000", "Huey Freeman", 12, 40, false, false));
        allPatients.add(new Patient("000201321", "Miku Hatsune", 16, 36, true, true));
        allPatients.add(new Patient("111201321", "Drake Josh", 33, 38, true, false));
        allPatients.add(new Patient("222201321", "April O'Neil", 29, 37, false, false));
        return allPatients;
    }



    // Opdracht 1( /1 ):

    //// Method for obtaining a unique list of patients and maintaining order- ()получения уникального списка пациентов и поддержания порядка
    public static List<Patient> getUniquePatients() { // spesialle lijst - unieke elementen
        Set<Patient> uniquePatientsSet = new LinkedHashSet<>(getAllPatients()); //LinkedHashSet поддержания порядка= om unieke elementen en volgorde te behouden
        List<Patient> uniquePatientsList = new ArrayList<>(uniquePatientsSet);//ArrayList om de unieke patiënten in volgorde op te slaan - для хранения уникальныз пациентов
        return uniquePatientsList; // возвращаем список уникальных пациентов
    }


    // oefening 2 ( /3 ):

    //Метод помещения отсортированного и отфильтрованного списка пациентов в очередь
    // () om de gesorteerde en gefilterde patiëntenlijst in een Queue te plaatsen
    private static Queue<Patient> getSortedPatientsQueue() {
        List<Patient> allPatients = getAllPatients();
        //sorteer patienten : temperature: age : insurance
        Collections.sort(allPatients,  new  TemperatureSorted().thenComparing(new AgeSorter()).thenComparing(new InsuranceSorter()));
        // gebruik een LinkedBlockingQueue om de resultaten in een Queue te plaatsen
        Queue<Patient> sortedPatientsQueue = new LinkedBlockingQueue<>(allPatients); // неограниченный и может расти LinkedBlockingQueue  is implemented as a linked node-based queue, meaning it uses a linked structure to connect elements in the queue.
        // to store the sorted and filtered list of patients

        // Geef de Queue terug
        return sortedPatientsQueue;

    }
}