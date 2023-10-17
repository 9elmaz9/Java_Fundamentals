package CarInheritance;

// SUV class represents a sports utility vehicle with additional features like bullbar and AWD
public class SUV extends Car {
    private boolean bullbar; // bullbar van de SUV -бампер
    private boolean isAWDOn; // vierwielaandrijving (AWD) van de SUV - вкл.чен ли полный привод

    // Конструктор для инициализации свойств авто
    // Constructor om eigenschappen van de SUV te initialiseren
    public SUV(String color, int hp) {
        super(color, hp); //  вызываем констр супер класса = roep de constructor van de superklasse aan
        this.bullbar = false; // standaard geen bullbar = по умолчани. нет бампера
        this.isAWDOn = false; // standaard geen vierwielaandrijving = нет полного привода по умолчанию
    }
//generate
    public boolean getBullbar() {  //getter
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }
// метод для включения полного привода
    // methode voor het inschakelen van vierwielaandrijving (AWD)
    public void allWheelDrive(boolean aWD) {
        isAWDOn = aWD;
        if (isAWDOn) {
            System.out.println("AWD is activated."); // Vierwielaandrijving is geactiveerd
        } else {
            System.out.println("AWD is deactivated."); // Vierwielaandrijving is gedeactiveerd
        }
    }
// переопределение метода для внедорожника. уникальность данного авто
    // overschrijf de accelerate methode voor de SUV
    @Override
    public void accelerate(int amount) {
        if (isAWDOn && getSpeed() + amount > 30) {
            setSpeed(30);
        } else {
            super.accelerate(amount);
        }
    }

    @Override //// method представление methode om de status van de dit car weer te geven
    public String toString() {
        return "SUVV{" +
                "color='" + getColor() + '\'' +
                ", speed=" + getSpeed() +
                ", hp=" + getHp() +
                "bullbar=" + bullbar +
                ", isAWDOn=" + isAWDOn +
                '}';
    }
}
