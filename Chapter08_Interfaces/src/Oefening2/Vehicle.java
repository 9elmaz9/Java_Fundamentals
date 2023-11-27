package Oefening2;

public interface Vehicle extends Motor{
// The vehicle extended the Motor interf  , and the Motor already contains a Switch interf - in  it
    @Override // een  interface Motor met de methode komt in vehicle  -
    void gas();

    @Override // komt uit Switch iterface in motor
    void toggleSwitch();

    void openDoor(int door);

    void closeDoor(int door);



}
