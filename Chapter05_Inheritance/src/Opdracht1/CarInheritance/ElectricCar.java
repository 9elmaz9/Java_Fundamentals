package Opdracht1.CarInheritance;


//электрический автомобиль с дополнительной батарей
// represents an electric car with an additional battery feature
public class ElectricCar extends Car {
    private int battery; // battery elec auto
    // Конструктор для инициализации свойств авто
    // сonstructor om eigenschappen van de elektrische auto te initialiseren
    public ElectricCar(String color, int hp, int battery) {
        super(color, hp); // Roep de constructor van de superklasse aan
        this.battery = battery; // hier
    }


    // Переопределение метода accelerate для электромобиля на основе формулы
//(amount + (battery / 100))

    // overschrijf de accelerate methode voor de elektrische auto op basis van F
    public void accelerate(int amount) {// уникальность unique propertie
        setSpeed(getSpeed() + amount + (battery / 100));
    }

    @Override // отрицательное переопределение метода slow
    //  (amount + (battery / 100))
    // overschrijf de slow methode voor de elektrische auto op basis van de formule (amount + (battery / 100)) maar dan negatief
    public void slow(int amount) {
        //super.slow(amount);
        setSpeed((getSpeed() - amount - (battery / 100))) ;
        if (getSpeed() < 0) {
            setSpeed(0);
        }
    }

    //переопределение метода парк для элект.кара
    // overschrijf de park methode
    public void park() {
        setSpeed(0);
        System.out.println("Charging is in progress."); // Opladen is bezig

    }

    //метод зарядки
    // Methode om de batterij op te laden
    public void charge(int amount){
        battery+=amount;
        if(battery>100){
            battery=100;
        }
        System.out.println("Battery is charged to " + battery + "%."); // Batterij is opgeladen tot ...
    }

    @Override // method представление methode om de status van de dit car weer te geven
    public String toString() {
        return "ElectricCar{" +
                "color='" + getColor() + '\'' +
                ", speed=" + getSpeed() +
                ", hp=" + getHp() +
                ", battery=" + battery +
                '}';
    }
}

