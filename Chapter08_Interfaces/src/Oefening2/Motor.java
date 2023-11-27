package Oefening2;

public interface Motor  extends Switch{
// een  interface Motor met de methode
    void gas();

    @Override // komt uit Switch iterface
    void toggleSwitch();

}
