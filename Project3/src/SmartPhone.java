public class SmartPhone implements ICamera, IGPS, IRadio, ISimCard, IWifi {

    private double PRICE;
    private String BRAND;
    private int numberOfPhotos;

    /*public SmartPhone(double PRISE, String BRAND,String COLOR) {
        this.PRICE=PRICE;
        this.BRAND=BRAND;
        this.numberOfPhotos=0;

    }*/

    public SmartPhone(double PRICE, String BRAND) {
        this.PRICE=PRICE;
        this.BRAND=BRAND;

    }

    public double getPRICE() {
        return PRICE;
    }

    public String getBRAND() {
        return BRAND;
    }

    @Override
    public void shootAPhoto(double amountOfPhotos) {
        System.out.println("Taking " + amountOfPhotos+ "photos");
        numberOfPhotos += numberOfPhotos;
    }

    @Override
    public String[] viewPhotos() {
        System.out.println("Viewing photos");
        //logic to retern foto
        return new String[]{"photo 1", "photo 2","photo 3","photo 4", " photo 5"};
    }

    @Override
    public String locatie(double latitude, double longitude) {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigating");

    }

    @Override
    public void playChannel(double fm) {
        System.out.println("Play channel FM"+ fm);

    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("Change channel FM"+fm);

    }

    @Override
    public void connect(String internetConnection) {
        System.out.println("Connect to internet connection" +internetConnection);

    }

    @Override
    public void disconnect(String internetConnection) {
        System.out.println("Disconnect from internet connection"+internetConnection);

    }
}




