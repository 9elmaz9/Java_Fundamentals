public class WhyPhoneApp {
    public static void main(String[] args) {

        WhyPhone phone = new WhyPhone(799.99, "IPhone", "Black");
        showSpecs(phone);
        System.out.println("\nDummy phone");
        DummyPhone dummyPhone = new DummyPhone();
        dummyPhone.showSpecs();
    }

    public static void showSpecs(SmartPhone phone){
        phone.connect("Wifi");
        phone.locate(52.6, 32.9);
        phone.shootAPhoto(4);
        String[] photos = phone.viewPhotos();
        for (String photo: photos){
            System.out.println(photo);
        }
        phone.startCall("04502306514");
        phone.endCall();

    }
}
