
import Opdracht1.CarInheritance.Cabrio;
import Opdracht1.CarInheritance.Car;
import Opdracht1.CarInheritance.ElectricCar;
import Opdracht1.CarInheritance.SUV;

//HOOFDKLASS
public class Main {// главный класс программы + является точкой входа в программу,

    public static void main(String[] args) {
        // Создаем объекты каждой вариации автомобиля
// maak objecten met:bij alle eigenschapen
        Car redSUV = new SUV("Red", 250);
        ElectricCar greenElectricCar = new ElectricCar("Green", 60, 60);
        Cabrio yellowCabrio = new Cabrio("Yellow",200,true);

        // yскоряем все автомобили на 50 = versnel alle auto's met 50
        redSUV.accelerate(50);
        yellowCabrio.accelerate(50);
        greenElectricCar.accelerate(50);
        //toon de huidige snelheid van elke auto ne versnelling
        // pоказываем текущую скорость каждого автомобиля после ускорения
        System.out.println("Current speed of red SUV: " + redSUV.getSpeed());
        System.out.println("Current speed of yellow Cabrio: " + yellowCabrio.getSpeed());
        System.out.println("Current speed of green Electric Car: " + greenElectricCar.getSpeed());

        // Паркуем все автомобили = parkeren alle auto's
        Car[] cars = {redSUV, yellowCabrio, greenElectricCar};
        for (Car car:cars){
            car.park();
        }
        //toon de status van elke auto na het parkeren
        // pоказываем статус каждого автомобиля после парковки
        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }
}