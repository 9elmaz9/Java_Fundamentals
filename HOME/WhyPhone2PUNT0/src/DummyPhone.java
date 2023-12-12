public class DummyPhone {


    public class dummyPhone implements ISimCard, IRadio{
        @Override
        public void playChannel(double fm) {
            System.out.println("Radio playing channel "+fm);
        }

        @Override
        public void changeChannel(double fm) {
            System.out.println("Radio channel changed to "+fm);
        }

        @Override
        public void startCall(String number) {
            System.out.println("Calling "+number);
        }

        public void showSpecs() {
            startCall("0444 66 55 33");
            endCall();
            playChannel(22.77);
            changeChannel(33.55);
        }
    }
}
