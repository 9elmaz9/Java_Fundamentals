public class WhyPhoneApp {
    public static void main(String[] args) {
        WhyPhone phone = new WhyPhone(234.0, "WhyBrand", "RED"); // create an instantie of WhyPhone

        //show spech of the phone
        //In de showSpecs methode kunnen we alle methoden aanroepen.
        showSpecs(phone);
        System.out.println("\nDummy phone");
        DummyPhone dummyPhone = new DummyPhone(); // obj voor DummyPnone
        dummyPhone.showSpecs();// method to show dummyphone
    }

    // show specs method  - method to show of a SmartPhone
    public static void showSpecs(SmartPhone phone) {

        phone.locatie(24.145, 56.252);
        phone.shootAPhoto(10);
        phone.viewPhotos(5);
        phone.playChannel(72.2);
        phone.changeChannel(56.3);
        phone.startCall("+32479408845");
        phone.connect("Wi-Fi Network");


    }


}