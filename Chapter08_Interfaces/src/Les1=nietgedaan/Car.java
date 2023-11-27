package Les1;
public class Car implements Les1.Vehicle {

    //properties
    private int gear = 0;
    private int maxGears = 5;
    private float speed = 0f;
    private float maxSpeed = 120f;

    //constructor
    public Car(int gear, int maxGears, float speed, float maxSpeed) {
        this.gear = gear;
        this.maxGears = maxGears;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    //interface methods + implementations
    @Override// annotation is unneccessary ! but doog practice
    public void speedUp() {
        if (speed < maxSpeed) {
            speed += 5f;
        }
    }

    @Override
    public void braking() {
        if (speed > 0) {
            speed -= 5f;
        }
    }

    @Override
    public void shiftGearUp() {
        if (gear < maxGears) {
            gear++;
        }
    }

    @Override
    public void shiftGeatDown() {
        if (gear > 0) {
           // gear -;
        }
    }

    @Override
    public int getCurrentGear() {
        return gear;
    }
}
