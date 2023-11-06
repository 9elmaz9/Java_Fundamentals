public interface ISimCard {
    // Method to start call
    default void startCall(String numner) {// implementation of the beginning ot the call
        System.out.println("Calling 911");// Bij de methode startCall() moet je default "Calling 911" printen

    }


    //method to the end call
    default void endCall() {//implementation of the complection of the call
        System.out.println("Call ended");//bij endCall() print je default "Call ended"
    }
}
