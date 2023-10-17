package CarInheritance;
 //предоставляет общую структуру и функциональность,
//basis class - inversatie van kenmerken en gedrag
public class Car {
    //  kласс Car представляет собой основной автомобиль с цветом, скоростью и лошадиной силой

    private String color; // eigenschappen
    private int speed;
    private int hp;

    // Constructor om eigenschappen van de auto te initialiseren

    public Car(String color, int hp) {
        this.color = color;
        this.hp=hp;
        this.speed = 0; // shelheid begint met 0
    }
// creeren door het gebruiken van : generate
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSpeed() {  // get krijg  : set набор
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    // Methode om te versnellen op basis van de formule (amount + (hp / 100))
//метод ускорения
public void accelerate(int amount){
        speed+=amount+(hp/100);
}
    // Methode om te vertragen op basis van de formule (amount + (hp / 100)) maar dan negatief
 //метода замедления
    public void slow(int amount){
        speed -= amount+(hp/100);
        if(speed<0){
            speed=0;
        }
    }
    // Methode om te parkeren, zet snelheid op nul , метод парковки , когда скорость равна 0  запарковованно
public void park(){
        speed=0;
}
    // toString methode om de status van de auto weer te geven
    //Метод toString для представления статуса автомобиля : generate ezzyly
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", hp=" + hp +
                '}';
    }
}
