public interface ISimCard {

    default void startCall(String number){
        System.out.println("Calling "+ number);
    }

    default void endCall(){
        System.out.println("Call ended");
    }
}
