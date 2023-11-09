public class DummyPhone implements ISimCard, IRadio {

    @Override
    public void startCall(String numner) {
        System.out.println("Calling" + numner);
    }

    @Override
    public void playChannel(double fm) {
        System.out.println("Radio playing " + fm);
    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("Radio chanel chfanged to "+ fm);

    }

    public void showSpecs(){
        startCall("0479 56 89 75");
        endCall();
        playChannel(55);
        changeChannel(54);
    }
}
